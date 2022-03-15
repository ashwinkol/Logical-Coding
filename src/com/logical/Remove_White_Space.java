package com.logical;
import java.util.*;
public class Remove_White_Space {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		
		String a = s.replace(" ","");
		
		System.out.println("Orignal String is: "+s);
		
		System.out.println("Remove WhiteSpacing: "+a);
	}

}
