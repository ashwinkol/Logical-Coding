package com.logical;

public class MatrixRotateUsingSecondArray {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] b = new int[3][3];
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {
				b[i][j] = a[j][i];

			}

		}

		System.out.println("Orignal Array: ");
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < 3; j++) {

				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				int tmp = b[i][0];
				b[i][0] = b[i][2];
				b[i][2] = tmp;
			}
		}

		System.out.println("90 Degree Matrix: ");
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < 3; j++) {

				System.out.print(" " + b[i][j]);
			}
			System.out.println();
		}

	}
}
