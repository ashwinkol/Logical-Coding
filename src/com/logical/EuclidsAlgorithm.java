package com.logical;

public class EuclidsAlgorithm {
	public static int baseCase(int a, int b) {
		
		if(b == 0) {
			return a;
		}
		return baseCase(b,a%b);
	}
	public static void main(String[] args) {
		
		
		int a = baseCase(1680, 640);
		
		System.out.println("Base Case: "+a);
	}

}
