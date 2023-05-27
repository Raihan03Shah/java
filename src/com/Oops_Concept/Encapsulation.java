package com.Oops_Concept;

public class Encapsulation {
	public void login() {
		System.out.println("login functionality");
	}
		
		private void logout() {
			System.out.println("logout functionality");
		}
		public static void main(String[] args) {
			System.out.println("this is main method functionality");
			
			Encapsulation obj = new Encapsulation();
			obj.login();
			obj.logout();
		}
	
	}


