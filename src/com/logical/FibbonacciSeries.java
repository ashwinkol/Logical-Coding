package com.logical;

public class FibbonacciSeries {

	public static void main(String[] args) {
		String x = "Ashwin";
		
		int a = 0;
		int b = 1;
		
		for (int i = 0; i < 15; i++) {
			System.out.print(a+" ");
			int k = a + b;
			a = b;
			b = k;
			
		}
	}

}
