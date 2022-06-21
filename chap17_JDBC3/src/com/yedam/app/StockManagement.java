package com.yedam.app;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.yedam.app.common.Info;
import com.yedam.app.history.History;
import com.yedam.app.history.HistoryDAO;
import com.yedam.app.product.Product;
import com.yedam.app.product.ProductDAO;
//사용자가 보는 것 , 사용자 클래스
//dao : 대략적인 기능에 대해서 적어주기 VS 사용자 클래스 : 여러가지 문제상황 대비
//ex. productIn() -> 등록된 제품인지 확인, 재고 있는지,,,,등등
public class StockManagement {

	private Scanner sc = new Scanner(System.in);
	private ProductDAO pDao = ProductDAO.getInstance();
	private HistoryDAO hDao = HistoryDAO.getInstance();
	
	
	public StockManagement() {
		
		while(true) {
			//메뉴 출력
			menuPrint();
			//메뉴 입력
			int menuNo = selectMenu();
			//각 기능별 실행
			if(menuNo == 1) {
				//제품 등록
				inputProduct();
				
			} else if(menuNo ==2) {
				//제품 입고
				productIn();
				
			} else if(menuNo ==3) {
				//제품 출고
				productOut();
				
			} else if(menuNo ==4) {
				//제품 재고
				productStock();
				
			} else if(menuNo ==5) {
				//전체 재고
				allProductStock();
				
			} else if(menuNo ==9) {
				//종료
				exit();
				
				break;
			} else {
				showInputError();
			}
		}
		
		
		
	}
	
	private void menuPrint() {
		System.out.println("=======================================================");
		System.out.println("1.제품 등록 | 2.입고 | 3.출고 | 4.제품 재고 | 5.전체 재고 | 9.종료 ");
		System.out.println("=======================================================");
	}
	
	
	private int selectMenu() {
		int menu = 0;
		try {
			menu = Integer.parseInt(sc.nextLine());
			
		} catch(NumberFormatException e) {
			System.out.println("숫자 형식으로 입력해주세요.");
		}
		
		return menu;
	}
	
	private void exit() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	private void showInputError() {
		System.out.println("메뉴를 참고하여 입력해주시기 바랍니다.");
	}
	
	//전제조건 : 현재 코드가 기존에 있는 데이터인지 확인하지않고 자동으로 번호가 부여되다보니 구분할 수 있는 이름으로 해줘야함
	
	private void inputProduct() {
		//제품 정보 입력
		Product product = inputAll();
		
		//DB에 저장
		pDao.insert(product);
	}
	
	private void productIn() {
			//발생할 수 있는 여러상황에 대비하여 만듦
		//입고할 제품과 수량 입력
		Info info = inputAmount();
		
		//기존에 등록되어있는 제품인지 확인 -> 단건 조회 했을때 나오면 된다(그 메소드참조해서 해석)
		//변수에 담아줘야 쓸 수 있으니까 프로덕트 타입의 프로덕트변수 지정
		Product product = pDao.selectOne(info.getProductName());
		
		if(product != null) {	//널이면 제품이 없는거니까 제품 등록해야함 -> -2번
			//-1. 기존에 등록된 제품일 경우 입고처리
			History history = new History();
			history.setProductId(product.getProductId());
			history.setProductCategory(1);
			history.setProductAmount(info.getProductAmount());
			
			hDao.insert(history);
			
		} else {
			//-2. 기존에 등록되지 않은 경우 별도 안내
			System.out.println("해당 제품의 정보를 먼저 등록해주세요");
		}
		
	}
	
	
	private void productOut() {
		//출고할 제품과 수량을 입력
		Info info = inputAmount();
		
		//등록되어있는 제품인지 확인 
		Product product = pDao.selectOne(info.getProductName());
		
		if(product == null) {
			System.out.println("해당 제품의 정보를 확인해주세요.");
		
			return; //등록되어있지않으면 메소드 종료
		}
			
		//재고량이 있는지 확인
		int stock = selectStock(product.getProductId());
		
		//재고량과 출고량 비교
		if(stock >= info.getProductAmount()){
			//-1. 위 세가지 조건을 모두 만족하는 경우에 출고처리
			History history = new History();
			history.setProductId(product.getProductId());
			history.setProductCategory(2);
			history.setProductAmount(info.getProductAmount());
		
			//dB에 저장 
			hDao.insert(history);
		} else {
			//-2. 각 조건이 만족되지 않는 경우 적합한 문구를 출력
			System.out.println("재고량이 출고량보다 작습니다.");
		}
	}
	
	
	private void productStock() {
		//검색하고자하는 제품 정보 입력
		String productName = inputName();
		
		//등록된 제품인지 확인
		Product product = pDao.selectOne(productName);
		
		if(product == null) {
			System.out.println("해당 제품의 정보가 등록되어있지 않습니다.");
			return;
		}
		
		//해당 제품의 재고 출력
		int stock = selectStock(product.getProductId());
		
		System.out.println("제품번호 : "+product.getProductId()
							+ ", 제품 이름 : " + product.getProductName()
							+ ", 재고량 : " + stock);
	}
	
	
	private void allProductStock() {
		Map<Integer, Integer> list = hDao.selectAllAmount();
		Set<Integer> productList = list.keySet();
		
		for(int productId : productList) {
			Product product = pDao.selectOne(productId);
			
			int stock = list.get(productId);
			
			System.out.println("제품번호 : "+product.getProductId()
			+ ", 제품 이름 : " + product.getProductName()
			+ ", 재고량 : " + stock);
			
		}
	}
	
	
	
	private Product inputAll() {
		Product product = new Product();
		System.out.println("제품 이름 > ");
		product.setProductName(sc.nextLine());
		
		System.out.println("제품 가격 > ");
		product.setProductPrice(Integer.parseInt(sc.nextLine()));
		return product;
	}
	

	private Info inputAmount() {
		Info info = new Info();
		System.out.println("제품 이름 > ");
		info.setProductName(sc.nextLine());
		
		System.out.println("제품 수량 > ");
		info.setProductAmount(Integer.parseInt(sc.nextLine()));
		return info;
	}
	
	
	private String inputName() {
		System.out.println("제품 이름 > ");
		return sc.nextLine();
		
	}
	
	private int selectStock(int productId) {
	
		int in = hDao.selectInAmount(productId);
		int out = hDao.selectOutAmount(productId);
		
		return (in - out);
	}
	
	
	
	
	
}
