package com.logical;

import java.util.*;

public class ArrayTest {

	public static void printArray(int[][] a) {
		
		

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(" " + a[i][j]);

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("Array Before the Rotation");
		printArray(a);

		// Transpose Matrix i.e Rows Becomes Colum
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				int tmp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = tmp;

			}
		}

		// swaping the the two Nnumbers (colums). i.e: swap 1 and 3
		// for 90 Anticlocwise Rotation Just Swap Two Rows
		for (int i = 0; i < a.length; i++) {
			int tmp = a[i][2];
			a[i][2] = a[i][0];
			a[i][0] = tmp;
		}

		System.out.println("Array After the Rotation");
		printArray(a);

	}
}