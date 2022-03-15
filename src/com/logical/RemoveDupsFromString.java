package com.logical;

import java.util.Scanner;

public class RemoveDupsFromString {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String: ");
		String a = sc.nextLine();
		
		StringBuilder b = new StringBuilder(a);
		for(int i=0;i<a.length();i++) {
			for(int j=i+1;j<a.length();j++) {
				
				if(a.charAt(i)==a.charAt(j)) {
					b.deleteCharAt(j);
				}
			}
		}
		System.out.println(b);
	}

}
