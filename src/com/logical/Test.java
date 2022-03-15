package com.logical;

public class Test {
	public static void main(String[] args) {
	
		String a = "aaaabbbc";
		int temp =0;
		
		String b ="";
		for(int i=0;i<a.length()-1;i++){
		if(a.charAt(i)==a.charAt(i+1)){
			int count=0;
			count+=1;
			temp += count;
			char x = a.charAt(0);
			
			b += x;
	}
		
	  System.out.println(temp);
		}
		
	}

}
