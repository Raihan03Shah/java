package com.Inheritance_Single;

public class Son extends Father {
	
	public void bank_Balance() {
		System.out.println("he has bank balance");
	}
	public static void main(String[] args) {
		Son s = new Son();
		s.bank_Balance();
		s.house();
		s.land();
		
	
	}

}
