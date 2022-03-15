package com.logical;

public class MissingNumberFromOtherArray {
	public static void main(String[] args) {

		int a[] = {12, 16, 15, 89, 45, 77, 99 };
		int a1[] = {  12, 16, 15, 89, 78   }; // 45 77 99 Missing from this
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a1.length; j++) {
				
				if(a[i] == a1[j]) {
					break;
				}
				
				if((j == a1.length-1) && (a[i]!=a1[j])) {
					System.out.print(" "+a[i]);
				}
				
			}
		}

	}

}
