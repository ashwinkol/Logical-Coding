package com.logical;

public class AllNumberValidation {
	public static void main(String[] args) {
		
		
		String a = "56789012340";
		int sum = 0;
		
		for (int i = 0; i < a.length(); i++) {
			sum+= Integer.valueOf(String.valueOf(a.charAt(i)));
		}
		if(sum == 45) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
	}

}
