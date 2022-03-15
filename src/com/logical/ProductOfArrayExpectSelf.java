package com.logical;

import java.util.Arrays;
//Product Of Array Except Self
// Asked into the Apple inc. 

public class ProductOfArrayExpectSelf {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] c = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			int mul = 1;
			for (int j = 0; j < a.length; j++) {
				if (i != j) {
					mul *= a[j];
				}
			}
			c[i] = mul;
		}

		System.out.println(Arrays.toString(c));
	}

}
