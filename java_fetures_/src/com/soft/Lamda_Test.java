package com.soft;

public class Lamda_Test implements Demo_Lamda_Expr{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo_Lamda_Expr obj = ()->System.out.println("Hi");
		
		obj.test();
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	

}
