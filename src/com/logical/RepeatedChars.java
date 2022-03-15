package com.logical;

public class RepeatedChars {
	public static void main(String[] args) {
		String s ="w3schools";
		char[] a = s.toCharArray(); //String to Char Array
		int count=0;
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					System.out.println("Duplicate Chars: "+a[j]);
					count++;
					break;
				}
			}
		}
	}

}
