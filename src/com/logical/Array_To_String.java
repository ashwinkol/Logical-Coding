package com.logical;
//Array to String
public class Array_To_String {

	public static void main(String[] args) {
		String[] a = {"india","is","Country"};
		String b="";
		
		for(int i=0;i<a.length;i++){
			b+=" "+a[i];   
		}
		
		System.out.println("We got String: "+b);
	}
}



