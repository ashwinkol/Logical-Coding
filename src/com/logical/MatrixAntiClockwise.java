package com.logical;

/*
Orignal Matrix: 
 1 2 3
 4 5 6
 7 8 9

Anticlockwise Matrix: 
 3 6 9
 2 5 8
 1 4 7
 */
public class MatrixAntiClockwise {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		/* {{ 3, 2, 1}, { 6, 5, 4 }, { 9, 8, 7 }   */
		/* {{3, 6, 9}, {6, 5 ,4 }, {9 , 8 , 7 } }  */
		/* {{3 , 6 , 9}{ 2 ,5 ,4},{ 1 , 8 , 7 } } */
		/*  {{3 , 6 , 9}{ 2 ,5 ,4},{ 1 , 8 , 7 } } */
		
		int[][] b = new int[3][3];
		System.out.println("Orignal Matrix: ");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
       
		for(int i = 0;i<a.length;i++) {
			int tmp = a[i][2];
			a[i][2] = a[i][0];
			a[i][0] = tmp;
		}
		
		
		for(int i = 0;i<a.length;i++) {
			
			for(int j = 0;j<a.length;j++) {
				
			b[j][i] = a[i][j];
		}
			
		}
		
		System.out.println("AnticlockWise Matrix: ");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				System.out.print(" " + b[i][j]);
			}
			System.out.println();
		}
	}
}
