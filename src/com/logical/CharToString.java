package com.logical;

import java.util.Scanner;

public class CharToString {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to Reverse: ");
		
		String a = sc.nextLine();
		
		String ans ="";
		
		for(int i=a.length()-1;i>=0;i--){
			char x = a.charAt(i);
			ans += String.valueOf(x);  //Convert Char to String
		}
		
		
		System.out.println("Reverse String Is: "+ans);
	}


}
