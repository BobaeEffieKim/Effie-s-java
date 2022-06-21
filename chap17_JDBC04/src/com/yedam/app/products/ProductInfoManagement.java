package com.yedam.app.products;

import com.yedam.app.common.Management;


//ProductManagement -> 제품에 대한 정보 관리하는 클래스
//Management-> 재고관리 (입고, 출고)
//ProductInfoManagement, ProductStockManagement -> 서브 프로그램

				//하나의 프로그램이 있고(전체) 
//(가지고 있는 DAO ->)ProductsDAO , ReceivingGoodsDAO,  TakeOutGoodsDAo
//서브1. 인포 								//서브2.스톡
//management 클래스에 필요한 필드는 다 있기때문에 여기서는 딱히 필드가 없음
// => 기존의 management에서 필드를 관리하고 서브프로그램에서는 땡겨 쓸 수 있도록 -> 유지보수에 훨씬 더 용이함


public class ProductInfoManagement extends Management{

	//제품에 대한 정보를 등록, 수정, 삭제
	public ProductInfoManagement() {
		while(true) {
			menuPrint();
			
			int menuNo = menuSelect();
			
			if(menuNo == 1) {
				//제품 정보 등록
				insertProductInfo();
				
			} else if(menuNo == 2) {
				//제품 정보 수정 - 가격
				updateProductInfo();
				
			} else if(menuNo == 3) {
				//제품 정보 삭제
				deleteProductInfo();
				
			} else if(menuNo == 9) {
				//뒤로 가기
				back();
				break;
				
			} else {
				//입력 오류
				showInputError();
			}
			
		}
	}
	
	@Override
	protected void menuPrint() {
		System.out.println("===============================================");
		System.out.println("1.제품 등록 | 2.제품정보 수정 | 3.제품정보 삭제 | 9.뒤로가기");
		System.out.println("===============================================");
	}
	
	private void back() {
		System.out.println("메인으로 돌아갑니다.");
	}
	
	private void insertProductInfo() {
		//제품 정보 입력
		Product product = inputAll();
		//DB에 저장
		pDAO.insert(product);
		
	}
	
	private void deleteProductInfo() {
		//제품 이름 입력
		String productName = inputName();
		
		//제품 정보 검색
		//-1. products 테이블에서 정보가져오기
		Product product = pDAO.selectOne(productName);
		
		if(product == null) {	//없다면 여기서 끝냄
			System.out.println("등록된 정보가 없습니다.");
			return;
		}
		
		//-2. 입고내역이 있는지 확인
		boolean isSelected = rDAO.selectInfo(product.getProductId());
		
		
		//DB에서 삭제
		if(!isSelected) {	//위에서는 검색하여 결과가 있을경우 트루/ 하지만 삭제하려면 검색결과가 없어야하고(다른테이블?),검색결과가 없으려면 폴스여야함->그래서 !사용 
			pDAO.delete(product.getProductId());
		} else {
			System.out.println("거래내역이 존재합니다.");
		}
		
	}
	
	
	private void updateProductInfo() {
		//제품이름 입력
		String productName = inputName();
		
		//제품정보 검색
		Product product = pDAO.selectOne(productName);
		
		if(product == null) {
			System.out.println("등록된 정보가 없습니다.");
			return;
		}
		
		//수정할 정보 입력
		product = inputUpdateInfo(product);
		
		//DB에 업데이트(수정)
		pDAO.updateInfo(product);
		
	}
	
	private Product inputAll() {
		Product product = new Product();
		System.out.println("제품이름 > ");
		product.setProductName(sc.nextLine());
		System.out.println("제품가격 > ");
		product.setProductPrice(Integer.parseInt(sc.nextLine()));
		return product;
		
	}
	

	private String inputName() {
		System.out.println("제품이름 > ");
		return sc.nextLine();
	}
	
	//업데이트쿼리를 이름,가격,아이디 다함께 업뎃되도록 짰기때문에
		//아래와 같이 기존의 정보는 들고 있고, 필요한것만 바꿔주고 수정하지않은 정보는 그대로 보존되도록 해줘야한다
	private Product inputUpdateInfo(Product product) {
		//이름
		System.out.println("기존 > "+ product.getProductName());
		System.out.print("수정(수정하지 않을 경우 0 입력) > " );
		
		String name = sc.nextLine();
		
		if(!name.equals("0")) {	//수정하지않을 경우 0, 그 이외의 값이 들어왔을때만 값을 교체
			product.setProductName(name);
		}
	
		//가격
		System.out.println("기존 > " + product.getProductName());
		System.out.print("수정(수정하지 않을 경우 -1 입력) > ");
		
		int price = Integer.parseInt(sc.nextLine());
		
		if(price > -1) {
			product.setProductPrice(price);
		}
		return product;
	}
}
