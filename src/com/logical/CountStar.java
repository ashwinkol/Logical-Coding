package com.logical;

public class CountStar {
public static void main(String[] args) {
	
	String a = "***|**|***";
	
	int count = 0;
	for (int i = 0; i < a.length(); i++) {
		
		if(a.charAt(i) == '|') {
			for (int j = i+1; j < a.length(); j++) {
				if(a.charAt(j)=='*') {
					count+=1;
				}
				
				if(a.charAt(j)=='|') {
					break;
				}
			}
		}
		
		if(a.charAt(i)=='|') {
			break;
		}
			
		
	}
	
	System.out.println("* Occurs: "+count+" Times");
}
}
