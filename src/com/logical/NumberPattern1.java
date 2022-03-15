package com.logical;
import java.util.*;	
public class NumberPattern1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number: ");
	int in = sc.nextInt();
	sc.close();
	
	int mul = in*2;
	int ans =in - mul;
	System.out.println(ans);
	/*
	for(int i = in - mul;i<0;i++) {
		System.out.print(i);
	}
	*/
}
}
