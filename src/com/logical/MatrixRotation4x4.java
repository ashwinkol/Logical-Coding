package com.logical;

import java.util.Arrays;

public class MatrixRotation4x4 {
	public static void main(String[] args) {

		// int[][] a = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14,
		// 12, 16 } };
		int[][] a = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print("   " + a[i][j]);
			}
			System.out.println();
		}

		// Transpose

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				int tmp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = tmp;
			}
		}

		System.out.println("after Traspose: ");

		for (int k = 0; k < a.length; k++) {
			for (int j = 0; j < a[k].length; j++) {
				System.out.print("   " + a[k][j]);
			}
			System.out.println();
		}

		/*
		int i =0;
		int j = a.length-1;
		
		while(i < (a.length-1)/2) {
			int tmp = a[i][j];
			a[i][j] = a[]
			
		}
		
		*/
		
		System.out.println("Ans: "+(a.length-1)/2);

		for (int k = 0; k < a.length; k++) {
			for (int x = 0; x < a.length; x++) {
				System.out.print("   " + a[k][x]);
			}
			System.out.println();
		}

	}
}
