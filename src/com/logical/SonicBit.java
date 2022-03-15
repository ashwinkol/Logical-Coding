package com.logical;

import java.util.Scanner;

public class SonicBit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans = "";
		String a = new String();
		System.out.println("Enter The Code: ");
		a = String.valueOf(sc.nextLine());

		for (int i = 0; i < a.length(); i++) {

			char x = a.charAt(i);

			if ((x > 47 && x < 58) || (x > 64 && x < 92) || (x > 96 && x < 124)) {
				ans += String.valueOf(x);
			}

		}
		System.out.println(ans);
	}
}
