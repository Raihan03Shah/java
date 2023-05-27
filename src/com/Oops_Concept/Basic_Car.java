package com.Oops_Concept;

public class Basic_Car {  
	
	public void engine() {
		System.out.println("this is engine");
	}
	public void brake() {
		System.out.println("this brake");
	}
	public void headline() {
		System.out.println("this is headline");
	}
	public void radiator() {
		System.out.println("this is radiator");
	}
	public static void main(String[] args) {
		Basic_Car obj = new Basic_Car();
		obj.brake();
		obj.engine();
		obj.headline();
		obj.radiator();
	
	}
	
	

}
