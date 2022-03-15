package com.logical;

public class StringPalindrome {
	public static void main(String[] args) {
		String a = "bjb";
		String b = "";
		
		for(int i = a.length()-1;i>=0;i--){
			b+=a.charAt(i);
		}
		if(a.equals(b)){
			System.out.println("Palindrome!");
		}
		
		else{
			System.out.println("Not Palindrome!");
		}
	}

}
