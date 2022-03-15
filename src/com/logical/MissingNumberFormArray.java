package com.logical;

public class MissingNumberFormArray {
	public static void notOne(int a[]) {
		for (int j = 1; j < a[0]; j++) {
			System.out.print(" " + j);

		}
	}

	public static void main(String[] args) {

		int[] a = {2, 3, 5 };
		boolean notOne = true;
		for (int i = 0; i < a.length - 1; i++) {

			if (notOne) {
				notOne(a);
				notOne = false;
			}

			if (a[i] + 1 != a[i + 1]) {
				for (int j = a[i] + 1; j < a[i + 1]; j++) {
					System.out.print(" " + j);
				}
			}

		}
		
	}

}
