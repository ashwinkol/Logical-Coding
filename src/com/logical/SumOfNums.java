package com.logical;
import java.util.*;
public class SumOfNums {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		
		int n = sc.nextInt();
		
		int sum=0;
		
		while(n>0){
			int r = n%10;
			sum+=r;
			n = n/10;
			
		}
		
		System.out.println("Sum Of The Digits Is: "+sum);
	}

}
