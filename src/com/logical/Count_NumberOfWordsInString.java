package com.logical;


//Program to find Number of Words  in String
import java.util.*;
public class Count_NumberOfWordsInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string: ");
		String s = sc.nextLine();
		
		String[] a = s.split(" ");
		
		System.out.println("Length of Words Is: "+a.length);
		
	}

}
