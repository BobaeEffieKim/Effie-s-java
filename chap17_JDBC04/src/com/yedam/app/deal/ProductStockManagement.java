package com.yedam.app.deal;
import java.util.ArrayList;
import java.util.List;

//사용자에게 제공하는 클래스
import com.yedam.app.common.Management;
import com.yedam.app.products.Product;
//재고 메뉴 -> 입고/ 출고 / 남은 재고량 /거래내역 (해당날짜나, 제품별).... 
public class ProductStockManagement extends Management{

	//제품 입고,출고, 재고를 관리하는 프로그램
	public ProductStockManagement() {
		
		boolean role = selectRole();
		
		//생성자 이용하여 와일문 돌리기
		while(true) {
			menuPrint(role);
			
			int menuNo = menuSelect();
			
			if(menuNo ==1 && role) {
				//제품 입고
				productIn();
				
			} else if(menuNo ==2 && role) {
				//제품 출고
				productOut();
				
			} else if(menuNo ==3) {
				//제품 재고
				productStock();
				
			} else if(menuNo ==4 && role) {
				//제품 거래내역
				productDeal();
				
			} else if(menuNo ==9) {
				//뒤로가기
				back();
				break;
				
			} else {
				showInputError();
			}
		}
	}
	
	
	
	protected void menuPrint(boolean role) {
		String menu = "";
		
		if(role) {
			menu += "1.입고 " + "2.출고 ";
		}
		
		menu += "3.재고 ";
		if(role) {
			menu += "4.거래내역 ";
		}
		
		menu += "9.뒤로가기 ";
		System.out.println("=========================================");
		System.out.println(menu);
		System.out.println("=========================================");
	}
	
	
	private void productIn() {
		//제품과 입고 수량을 입력
		DealInfo info = inputAmount();
		//해당 제품의 등록여부
		Product product = pDAO.selectOne(info.getProductName());
		
		if(product == null) {
			System.out.println("등록된 제품이 아닙니다.");
			return;
		}
		
		//등록되었을 경우 -> 입고처리
		info.setProductId(product.getProductId());
		rDAO.insert(info); 	//분산되어있는 정보를 하나로 처리 
		
		//입고처리가 완료되었을 경우 -> 제품정보의  재고량 수정
			//메소드를 독립적으로 만드는 이유 -> 한번에 처리할 수 없어서/ 입고 출고 다 쓰니까 재사용도 해야돼서
		updateProductStock(info.getProductId());
		
	}
	
	private void productOut() {
		//제품 이름과 출고수량 입력
		DealInfo info = inputAmount();
		
		//제품의 등록 여부
		Product product = pDAO.selectOne(info.getProductName());
		
		if(product == null) {
			System.out.println("등록된 제품이 아닙니다.");
			
			return;
		}
		
		//해당 제품의 재고와 출고수량 비교
		
		if(product.getProductStock() < info.getProductAmount()) {
			System.out.println("재고가 부족합니다.");
			
			return;
		}	
			//재고보다 출고수량이 적을 경우 출고처리
			info.setProductId(product.getProductId());
			tDAO.insert(info);
			
			//제품의 재고량을 수정
			updateProductStock(info.getProductId());
	}
		
		private DealInfo inputAmount() {
			DealInfo info = new DealInfo();
			
			//제품 이름
			System.out.println("제품 이름 > ");
			info.setProductName(sc.nextLine());
			
			//수량
			System.out.println("수량 > ");
			info.setProductAmount(Integer.parseInt(sc.nextLine()));
			return info;
		}
		
		private void updateProductStock(int productId) {
			
			//해당 제품의 재고량 확인 및 수정
			
			//해당 제품의 입고량
			int inAmount = rDAO.selectAmount(productId);
			//해당 제품의 출고량
			int outAmount = tDAO.selectAmount(productId);
			//재고(입고량 - 출고량)을 수정
			int stock = inAmount - outAmount;
			
			Product product = new Product();
			product.setProductId(productId);
			product.setProductStock(stock);
			pDAO.updateStock(product);
		}
		
		private void productStock() {
			//재고를 조회하고자 하는 제품이름 입력
			String productName = inputName();
			
			Product product = pDAO.selectOne(productName);
			
			if(product == null) {
				System.out.println("등록된 제품이 아닙니다.");
				return;
			}
			
			//해당 제품의 정보를 출력
			System.out.println(product);
			
			
		}
		
		private void productDeal() {

			//입고, 출고 선택
			int choice = inputSelect();
			
			
			List<DealInfo> list = new ArrayList<>();
			
			if(choice == 1) {
				list = rDAO.selectAll();
				
			} else if(choice == 2) {
				list = tDAO.selectAll();
			}
			
			for(DealInfo info : list) {
				System.out.println(info);
			}
		}
	
		private String inputName() {
			System.out.println("제품 이름 > ");
			return sc.nextLine();
		}
		
		private int inputSelect() {
			System.out.println("분류 : 1.입고 | 2.출고");
			int selected = Integer.parseInt(sc.nextLine());
			
			if(selected == 1) {
				System.out.println("====================입고내역");
			} else {
				System.out.println("====================출고내역");
			}
			return selected;
		}
		
		private void back() {
			System.out.println("메인으로 돌아갑니다.");
		}
}
