package com.logical;
import java.util.*;
import java.lang.*;
public class ReverseString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		
		StringBuffer b = new StringBuffer(s);

		
		String res = b.reverse().toString();
		
		System.out.println("The Reverse String: "+res);
		
		
	}

}
