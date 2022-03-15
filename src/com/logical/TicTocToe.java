package com.logical;

import java.util.*;

public class TicTocToe {
	static char[][] b = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	static String a = "";
	static String playerOne = "XXX";
	static String playerTwo = "OOO";
	// User input

	public static void userInput(int num, char a) {

		switch (num) {
		case 1:
			b[0][0] = a;
			printMatrix(b);
			break;

		case 2:
			b[0][1] = a;
			printMatrix(b);
			break;

		case 3:
			b[0][2] = a;
			printMatrix(b);
			break;

		case 4:
			b[1][0] = a;
			printMatrix(b);
			break;

		case 5:
			b[1][1] = a;
			printMatrix(b);
			break;

		case 6:
			b[1][2] = a;
			printMatrix(b);
			break;

		case 7:
			b[2][0] = a;
			printMatrix(b);
			break;

		case 8:
			b[2][1] = a;
			printMatrix(b);
			break;

		case 9:
			b[2][2] = a;
			printMatrix(b);
			break;

		default:
			System.out.println("Please Enter Valid Input!");
			break;
		}
	}

	// Print The Matrix
	public static void printMatrix(char[][] b) {

		for (int i = 0; i < b.length; i++) {
			System.out.println("----------");
			for (int j = 0; j < b.length; j++) {
				System.out.print("| " + b[i][j]);
			}
			System.out.println(" ");
		}

	}

	public static void finalResult(char[][] x) {

		// Horizontal Scan
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				a += x[i][j];

			}
		}
		theWinner(a);
		// Virtical Scan
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				a += x[j][i];

			}
			theWinner(a);
		}

		// Diagonal Scan
		for (int i = 0; i < x.length; i++) {
			for (int j = i; j < x.length; j++) {
				if (j == i) {
					a += x[j][i];
				}

			}

		}
		theWinner(a);

		// Diagonal Scan form left
		int k = 0;
		while (k < x.length) {
			for (int i = 2; i >= 0; i--) {
				for (int j = 0; j < x.length; j++) {
					if (j == i) {
						a += x[k][i];
					}

				}

				k += 1;
			}
			theWinner(a);

		}

	}

	public static void theWinner(String a) {
		if (a.equals(playerOne)) {
			System.out.println("Player X Wins!!");

		}

		if (a.equals(playerTwo)) {
			System.out.println("Player O Wins!!");

		}
		a = "";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter Input For X: ");
			int one = sc.nextInt();
			userInput(one, 'X');
			finalResult(b);

			System.out.println("Enter Input For O: ");
			int two = sc.nextInt();
			userInput(two, 'O');
			finalResult(b);

		}
		sc.close();

		finalResult(b);

	}

}
