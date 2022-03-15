package com.logical;

import java.util.Arrays;

public class MergeTwoArrays {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 5, 6, 7, 8, 9 };
		int[] c = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}

		for (int i = 0; i < b.length; i++) {
			for (int j = a.length+i; j < c.length; j++) {
                   c[j] = b[i];
                   break;
			}
		}

		System.out.println(Arrays.toString(c));
	}

}
