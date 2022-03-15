package com.logical;

import java.util.*;

public class InsertionSortTest {
	public static void main(String[] args) {

		int[] a = { 5, 2, 4, 6, 1, 3 };

		for (int j = 1; j < a.length; j++) {
			int key = a[j];
			int i = j - 1;

			while (i > 0 && a[i] > key) {
				a[i + 1] = a[i];
				i = i - 1;
				a[i + 1] = key;

			}

		}
		System.out.println(Arrays.toString(a));
	}

}
