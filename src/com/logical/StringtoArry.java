package com.logical;

import java.util.*;

public class StringtoArry {
	public static void main(String[] args) {
		String str = "india is my Country";
		ArrayList<String> aarL = new ArrayList<String>();
		char[] a = str.toCharArray();
		char[] x;
		for(char c: a){
			String tempp ="";
			tempp+=c;
			if(c ==' '){
				aarL.add(tempp);
			}
		}
		for(int i=0;i<=aarL.size();i++){
		System.out.println(aarL.get(i));
		
		}
			
	
	}

}
