package com.logical;
import java.util.*;
public class ReverseStrin {
	public static void main(String[] args) {
		
		String a = "aba";
		
		StringBuffer b = new StringBuffer(a);
		if(a.equals(String.valueOf(b.reverse()))) {
			System.out.println("Panlindrome ");
		}
		
		else {
			System.out.println("Not Palindrome!");
		}
	}

}
