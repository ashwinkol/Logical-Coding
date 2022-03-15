package com.logical;

import java.util.Arrays;

public class Mat {

	public static void printMat(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("Normal Matrix: ");
		printMat(a);


		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				int tmp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = tmp;
			}
		}

		System.out.println("Transpose Matrix: ");
		printMat(a);

		System.out.println("Matrix Roatation: ");

		for (int i = 0; i < a.length; i++) {

			int tmp = a[0][i];
			a[0][i] = a[2][i];
			a[2][i] = tmp;
		}

		printMat(a);

	}

}
