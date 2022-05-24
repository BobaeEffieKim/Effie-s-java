package com.yedam.java.ch0605;

public class PlanetTest {

	public static void main(String[] args) {
		System.out.println("pi :"+Planet.pi);
		//Planet.pi = Math.pi;   //복사하려고했지만 planet.pi 는 파이널로 막아놨기때문에, 출력은 되지만 값변경이나 복사는 안됨.
		
		Planet earth = new Planet(6400);
		System.out.println("earth :" + earth.radius);
		//earth.radius = 6000; //오류
		Planet moon = new Planet(1500);
		System.out.println("moon :" + moon.radius);
		
		
	}

}
