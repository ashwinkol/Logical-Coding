package com.logical;

import java.util.*;

public class String_To_StringArray {
	public static void main(String[] args) {
		String a ="india is this hello ";
		String[] ans;
		
		ans = a.split(" ");
		
		for(int i = ans.length-1 ;i>=0;i--){
			System.out.print(" "+ans[i]);
		}
		
	}

}
