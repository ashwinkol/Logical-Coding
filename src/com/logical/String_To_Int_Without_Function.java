package com.logical;

public class String_To_Int_Without_Function {
	public static void main(String[] args) {

		String str = "1234";
		int num = 0;
		for (int i = 0; i < str.length(); i++) {

			num = num * 10 + str.charAt(i) - 48;

		}
		System.out.println("The Int Is: " + num);

	}

}
