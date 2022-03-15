package com.logical;

public class MultiplicationWithoutMulOperator {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		int product = 0;
		
		while(b!=0) {
			product+=a;
			b--;
		}
		
		System.out.println("the multiplication of Numbers is: "+product);
	}

}
