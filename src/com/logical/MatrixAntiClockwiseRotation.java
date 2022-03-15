package com.logical;
import java.util.*;
public class MatrixAntiClockwiseRotation {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("Orignal Array: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}

		
		/* Transpose of Matric */
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				int tmp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = tmp;
			}

		}
		
		System.out.println("Transpose Matrix: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}

		/* Anti ClockWise Rotation */
			for (int row = 0; row < a.length; row++) {
				int tmp = a[0][row];
				a[0][row] = a[2][row];
				a[2][row] = tmp;

			
		}

		System.out.println("Array After Anticlockwise  Rotation: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(" "+Arrays.toString(a[0])+" "+Arrays.toString(a[1])+" "+Arrays.toString(a[2]));
	}

}
