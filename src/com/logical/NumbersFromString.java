package com.logical;

import java.util.*;

public class NumbersFromString {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string including digits: ");
		String in = sc.nextLine();
		String ans = " ";
		for (int i = 0; i < in.length(); i++) {
			int a =(int)in.charAt(i);
            if(a > 47 && a < 58) {
            	char x = (char)a;
            	ans+=x;
            }
		}
		System.out.println("The Digits in String are: "+ans);
		
		
		

	}
}