package com.logical;

import java.util.*;

public class MatricRotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input: ");
		System.out.println("1.90 Colocwise Array Rotate");
		System.out.println("2.90 Anti-Colocwise Array Rotate");

		int select = sc.nextInt();
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		if (select > 0 && select < 3) {
			System.out.println("Array Is: ");
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					System.out.print(" " + a[i][j]);
				}
				System.out.println();
			}

			if (select == 1) {
				/* Traspose Matrix */
				for (int i = 0; i < a.length; i++) {
					for (int j = i; j < a.length; j++) {
						int tmp = a[i][j];
						a[i][j] = a[j][i];
						a[j][i] = tmp;
					}
				}

				for (int i = 0; i < a.length; i++) {
					int tmp = a[i][0];
					a[i][0] = a[i][2];
					a[i][2] = tmp;
				}
				System.out.println("ClockWise Matrix: ");
				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < a.length; j++) {
						System.out.print(" " + a[i][j]);
					}
					System.out.println();
				}

			}

			if (select == 2) {
				/* Transpose Matrix */
				for (int i = 0; i < a.length; i++) {
					for (int j = i; j < a.length; j++) {
						int tmp = a[i][j];
						a[i][j] = a[j][i];
						a[j][i] = tmp;
					}
				}

				for (int i = 0; i < a.length; i++) {
					int tmp = a[0][i];
					a[0][i] = a[2][i];
					a[2][i] = tmp;
				}
				System.out.println("AnticlockWise Matrix: ");
				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < a.length; j++) {
						System.out.print(" " + a[i][j]);
					}
					System.out.println();
				}

			}


		}
		
		else {
			System.out.println("Please Enter the Valid Input!");
		}

	}

}
