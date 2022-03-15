package com.logical;

public class MatrixSpiralPrint {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }};

		System.out.println("Matrix is: ");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("The Series Is: ");


		for (int i = 0; i < a.length; i++) {

			if (i == 0) {

				for (int k = 0; k < a.length; k++) {
					System.out.print(" "+a[i][k]);

				}
			}
			
			if(i == 1) {
				System.out.print(" "+a[i][a[1].length-1]);
			}
			
			if(i==2) {
				for(int k = a[i].length-1;k>=0;k--) {
					System.out.print(" "+a[i][k]);
					
				}
				
				for(int f = 0;f<a[i].length-1;f++) {
					System.out.print(" "+a[i-1][f]);
				}
			}
			
			
		}

	}

}
