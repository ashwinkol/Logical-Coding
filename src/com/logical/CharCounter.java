package com.logical;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

//Number of Characters in the string
public class CharCounter {
	
	public static void charCounter(String in ) {
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		
		for (int i = 0; i < in.length(); i++) {
			
			char ch = in.charAt(i);
			map.put(ch, 0);
		}
		
		
		for (int j = 0; j < in.length(); j++) {
			
			char ch = in.charAt(j);
			int value = map.get(ch);
			map.put(ch, value+1);
		}
		
		for(Entry<Character, Integer> mp : map.entrySet()) {
			
			System.out.println(mp.getKey()+" = "+mp.getValue());
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String: ");
		String inp = sc.next();
		charCounter(inp.toLowerCase());
		
		
		
	}

}
