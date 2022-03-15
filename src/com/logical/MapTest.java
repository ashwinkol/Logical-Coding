package com.logical;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Map m  = new HashMap();
	System.out.println("Enter the String: ");		
	
	String x = sc.nextLine();
    char[] in = x.toCharArray();
    
	for(int i=0;i<in.length;i++){
		char a = in[i];
		int count=1;

			
		for(int j=i+1;j<in.length;j++) {
			if(in[j]==a) {
				count+=1;
				in[j]=' ';
			}
			
			if(in[j]==' ') break;
			
		}
		
		if(a!=' ') m.put(a,count);
		
		in[i] = ' ';
		count =0;
	}
		
	
	
	System.out.println(m);
	}

}
