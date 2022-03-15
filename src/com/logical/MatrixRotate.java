package com.logical;

public class MatrixRotate {
	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("Orignal Matrix: ");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				int tmp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = tmp;
			}
		}

		for (int i = 0; i < a.length; i++) {
			int tmp = a[i][2];
			a[i][2] = a[i][0];
			a[i][0] = tmp;
		}

		System.out.println("Rotate Matrix: ");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}

	}

}
