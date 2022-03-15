package com.logical;

import java.util.Arrays;

public class BinarySearch {
	public static int binSearch(int[] a, int start, int end, int find) {

		if (end >= start) {
			int mid = start + (end - start) / 2;

			if (a[mid] == find)
				return mid;

			if (find > a[mid])
				return binSearch(a, mid + 1, end, find);

			else
				return binSearch(a, start, mid - 1, find);
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] a = { 1, 4, 6, 8, 9, 10, 12, 13, 14, 17, 19, 21 };
		int s1 = 8;

		Arrays.binarySearch(a, s1);
		int index = binSearch(a, 0, a.length - 1, s1);
		if (index == -1) {
			System.out.println("Number not exist in Array");
		} else {
			System.out.println("We Found Is at index " + index);
		}

	}

}
