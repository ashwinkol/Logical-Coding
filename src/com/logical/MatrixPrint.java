package com.logical;

import java.util.*;

public class MatrixPrint {
	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("You have Inserted Array: ");
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j <= 2; j++) {
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}

		/* Reverse the Array */

		for (int i = 0; i < a.length; i++) {

			int tmp = a[i][0];
			a[i][0] = a[i][2];
			a[i][2] = tmp;
		}

		/* Print The Array */
System.out.println("Afetr Reverse: ");
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j <= 2; j++) {
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}

	}

}
