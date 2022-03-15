package com.logical;
import java.util.*;
public class ShowUpperCase {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String With Capital Letters: ");
		String in = sc.nextLine();
		sc.close();
		char[] c = in.toCharArray();
		String ans ="";
		for(int i=0;i<c.length;i++) {
			int a =(int)c[i];
			
			if(a < 97) {
				ans+=c[i];
			}
		}
		System.out.println(ans);
	}

}
