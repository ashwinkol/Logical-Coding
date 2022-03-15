package com.logical;

import java.lang.*;
import java.util.*;

public class StringBufferTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.next();
		
		
		StringBuffer b = new StringBuffer(s);
		
		String a = b.toString();
		String c = b.reverse().toString();
		
		if(a.equals(c)){
			System.out.println("Palindrome");
		}
		
		else{
			System.out.println("Not palindrome!");
		}
		
	}

}
