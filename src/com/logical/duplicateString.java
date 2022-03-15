package com.logical;

import java.util.Arrays;

//Program to find Duplicate String and there Counter
public class duplicateString {
	public static void main(String[] args) {
		
		String a = "india is the country is the";
		String[] b = a.split(" ");
		
		for(int i=0;i<b.length;i++){
			for(int j=i+1;j<b.length;j++){
				if(b[i]==b[j]){
					b[j]="0";
				}
			}
		}
		
		System.out.println(Arrays.toString(b));
	}

}
