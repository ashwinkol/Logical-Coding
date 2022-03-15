package com.logical;

import java.util.Arrays;
import java.util.Scanner;
//Program to Find Non Repeating Chars
public class RemoveDuplicateCharInString {
  public static void main(String[] args) {
	  
	  
	  boolean[] a = new boolean[128];
	  Scanner sc = new Scanner(System.in);
	  String ans="";
	  System.out.println("Enter The String: ");
	  String in = sc.next();
	  
	  char[] b = new char[in.length()];
	  
	  b = in.toCharArray();
	  

	  for(char x : b) {
		  int t =(int)x;
		  a[t] = true;
	  }
	  
	  for(int i=0;i<128;i++) {
		  if(a[i]==true) {
			  ans +=(char)i; 
		  }
	  }
	  
	  System.out.println(ans);
}

}
