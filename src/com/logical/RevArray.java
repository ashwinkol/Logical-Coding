package com.logical;

import java.util.Arrays;

public class RevArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Before Reverse: "+Arrays.toString(a));
		int len = a.length - 1;
		for (int i = 0; i <= a.length / 2-1; i++) {
			int tmp = a[i];
			a[i] = a[len];
			a[len] = tmp;
            len-=1;
		}
		
		System.out.println("After Reverse: "+Arrays.toString(a));
	}
}
