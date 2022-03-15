package com.logical;
import java.util.*;
public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number to Make it Reverce: ");
		
		
		int a = sc.nextInt();
		int temp =a; 
		int rev=0;
		while(a>0){
			int r = a%10; //2
			rev = rev*10 + r; //121
			a =a/10;   //1
		}
		System.out.println("Reverse Number Is: "+rev);
	}

}



