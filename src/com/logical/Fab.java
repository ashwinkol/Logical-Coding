package com.logical;

public class Fab {
	public static void main(String[] args) {

		int t1 = 0, t2 = 1, sum = 0;

		for (int i = 0; i < 20; i++) {
			System.out.print(t1 + " ");
			sum = t1 + t2;
			t1 = t2;
			t2 = sum;

		}

	}
}
