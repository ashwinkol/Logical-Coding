package com.logical;

public class Fibonacci {
	public static void main(String[] args) {

		int t1 = 0;
		int t2 = 1;
		int n = 20;

		for (int i = 1; i < n; i++) {

			System.out.print(t1 + " ");

			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}

	}

}
