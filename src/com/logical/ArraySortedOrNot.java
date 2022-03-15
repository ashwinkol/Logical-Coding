package com.logical;

import java.util.Arrays;

public class ArraySortedOrNot {

	public static boolean IsSorted(int[] a) {
		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}

		Arrays.sort(b);

		for (int i = 0; i < b.length; i++) {

			if (a[i] == b[i]) {
				continue;
			}

			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };

		if (IsSorted(a)) {
			System.out.println("Sorted");
		}

		else {
			System.out.println("Not Sorted");
		}
	}

}
