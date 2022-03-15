package com.logical;
import java.util.*;
public class AbcdPattern {
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Number: ");
	int in = sc.nextInt();
	int x = in+65;
	
	for(int i =0;i<in;i++) {
		for(int j=i+65;j>=65;j--) {
		char ans = (char)j;
		System.out.print(ans);
		
	}
	System.out.println();
}
}
}
