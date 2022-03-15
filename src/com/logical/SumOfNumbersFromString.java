package com.logical;

public class SumOfNumbersFromString {
	public static void main(String[] args) {

		String a = "I2n2dia is the 12345 country and i  love it 867";

		int sum = 0;
	
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) > 47 && a.charAt(i) < 58) {

				int c = Integer.valueOf((String.valueOf(a.charAt(i))));
				sum+=c;
			}
		}

		System.out.println("Sum is: "+sum);

	}

}
