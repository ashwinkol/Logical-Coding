package com.logical;

import java.util.Arrays;

public class SortArrayToNagativeToPositve {

	public static void main(String[] args) {

		int[] a = { 5, 2, -5, 10, -1, 13, -7, 13, -10, 134, -512, -144, 512 };

		for (int i = 0; i < a.length; i++) {

			for (int j = 0 + i; j < a.length; j++) {

				if (a[j] < 0) {
					int tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;
				}
			}
		}

		System.out.println(Arrays.toString(a));
	}
}
