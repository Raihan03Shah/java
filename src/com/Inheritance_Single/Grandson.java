package com.Inheritance_Single;

public class Grandson extends Son {
	public void bike() {
		System.out.println("bike property");
	}
	public static void main(String[] args) {
	
		Grandson gs = new Grandson();
		gs.bike();
		gs.bank_Balance();
		gs.house();
		gs.house();
	
	
	}

}
