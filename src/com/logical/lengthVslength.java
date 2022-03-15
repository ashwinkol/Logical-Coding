package com.logical;


// length() = 0  for String 
// length   = 1  For Array
public class lengthVslength {
	public static void main(String[] args) {
		String a = "123456";
		System.out.println("String "+a.length()); //6 but last indexIs 5
		
		String[] b ={"1","2","3","4","5","6"};
		
		for(int i=0;i<=a.length()-1;i++){
			System.out.println(b[i]);
		}
	}

}
