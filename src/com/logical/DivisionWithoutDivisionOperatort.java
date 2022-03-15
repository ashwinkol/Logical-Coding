package com.logical;

public class DivisionWithoutDivisionOperatort {
	public static void main(String[] args) {
		
		int a = 600;
		int b = -7 ;
		int count = 0;
		
		while(a!=0) {
			a-=b;
			count+=1;

		}
		System.out.println(count);
	}

}
