package com.logical;
import java.util.*;
public class NagativeNumberConverter{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number To Convert Into Nagative: ");
		int in = sc.nextInt();
		int ans = ( in - (in * 2));
		System.out.println("Nagative Number of "+in+" is: "+ans);
	}
}
