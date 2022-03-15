package com.logical;

import java.util.Scanner;

public class TicTock {
	public static void printMatrix(char[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print("|___");

				System.out.print(a[i][j]);
				System.out.print("___|");

			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] data = { { 'X', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
		printMatrix(data);
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("X: ");
			int One = sc.nextInt();
			System.out.println("O: ");
			
			
		}
	}

}
