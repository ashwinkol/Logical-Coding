package com.logical;
//this question is asked to ketan chapke on interview
public class PrintTable {
	public static void main(String[] args) {
		
		String a= "5075";
		for(int i =0;i<a.length();i++) {
			
			if(Integer.parseInt(String.valueOf(a.charAt(i)))!= 0) {
		    
		    int x = Integer.valueOf(String.valueOf(a.charAt(i))) ;
			for(int j=1;j<11;j++) {
			System.out.println(x+"  X  "+j+"  = "+x*j);
			
			}
			System.out.println();
		}
			
		}
	}

}
