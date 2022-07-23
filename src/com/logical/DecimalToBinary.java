package com.logical;

public class DecimalToBinary {

	public static void decToBin(int input) {

		int[] b = new int[40];
		int i = 0;
		while (input > 0) {

			b[i] = input % 2;
			input = input / 2;
			i++;
		}

		for (int j = b.length - 1; j >= 0; j--) {
			System.out.print(b[j] + " ");
		}

	}

	public static void main(String[] args) {

		decToBin(8);
	}
}
