package com.logical;

public class ShubhamInterviewQuestion {
	public static void main(String[] args) {
		String one = "aaab baad baaa";
		String two = "";
		int first = 0, second = 0;
		for (int i = 0; i < one.length(); i++) {
			two += one.charAt(i);
		}

		char[] a = two.toCharArray();

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 'b') {
				first = i;
				break;
			}
		}

		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] == 'b') {
				second = i;
				break;
			}
		}

		System.out.println("b starts at " + first + " b ends at " + second);
	}

}
