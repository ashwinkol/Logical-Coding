package com.logical;

import java.util.Scanner;

// Print pattern 1 $ 3 $ 5 $ 7 
public class ThePattern1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input the Number: ");
		int in = sc.nextInt();
		
		for(int i=1;i<=in;i+=2){
			if(i==in){
				System.out.print(i);
			}
			else {
				System.out.print(i+" $ ");
			}
		}
		
	}

}
