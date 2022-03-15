package com.logical;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCountInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = sc.nextLine();
		int[] a = new int[128];
		
		for(int i =0;i<input.length();i++) {
				
			char in = input.charAt(i);
			int convert = (int)in;
			a[convert]+=1;
		}
		
		
  HashMap<Character,Integer> map = new HashMap<Character,Integer>();	
  
  for(int j=0;j<128;j++) {
	  
	  if(a[j] > 0) {
		  char conv = (char)j;
		  map.put(conv,a[j]);
	  }
  }
		System.out.println(map);
	}

}
