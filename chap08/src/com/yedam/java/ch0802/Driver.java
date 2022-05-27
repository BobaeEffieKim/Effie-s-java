package com.yedam.java.ch0802;

public class Driver { //Bus든 Taxi든 직접적인 관계는 없다. 사용관계

	void drive(Vehicle vehicle) { //자동차를 운전하는 것만 driver가 알고있음
	
		
		//타입변환이 강제로 될때(?) instanceof 이용해서 확인해보기!
		if(vehicle instanceof Bus){//지금 내가 운전하려고 하는 vehicle이 bus라면 승차요금 체크하라. 
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		
		vehicle.run();			  //운전하는 방법만 알고있는 것을 호출하는 것
	}
	
}
