package com.logical;

public class StringTest {
	public static void main(String[] args) {

		String a = "1245";
		int sum = 0;
		for (int i = 0; i < a.length(); i++) {
			int b = Integer.valueOf(String.valueOf(a.charAt(i)));
			sum += b;

		}
		System.out.println("Sum Is: " + sum);
	}
}
