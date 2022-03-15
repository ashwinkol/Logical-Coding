package com.logical;

import java.util.*;
// 1,2,3,4,5,6,7 == 7,6,5,1,2,3,4

// Peek Element in array
public class Sms_ShortCut_To_Full {
	// Reverse subarray a[0..k-1]

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Message :");
	String in = sc.nextLine();
	String ans = "";
	String[] a = null;
	for (int i = 0; i < in.length(); i++) {
		
		 a = in.split(" ");
    }
	
	for (int i = 0; i < a.length; i++) {
		
		String msg = a[i];
		
		if(msg.equals("u") || msg.equals("s") || msg.equals("2day") || msg.equals("y") ) {
			
			switch(msg) {
			case "u" : msg = "you";
					   ans+=" "+msg;
					   break;
			
			case "s": msg = "yes";
					  ans+=" "+msg;
					  break;
			
			case "2day": msg = "today";
					     ans+=" "+msg;
					     break;
			
			case "y": msg = "why";
			          ans+=" "+msg;
			          break;
			
			}
		}
		else {
			ans+=" "+msg;

		}
		
		
	}
	
	
	System.out.println(ans);
		
	}
}
