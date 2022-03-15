package com.logical;

import java.util.*;

public class Reverse_The_Word {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Word you want to Reverse: ");
		String rev = sc.next();
		
		StringBuffer s = new StringBuffer(rev);
		
		System.out.println("The Reverse String is: ");
		System.out.println(s.reverse().toString());
		
	}

}
