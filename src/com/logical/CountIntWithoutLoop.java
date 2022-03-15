package com.logical;
import java.util.*;
public class CountIntWithoutLoop {
	public static void main(String[] args) {
		  Scanner sc =new Scanner(System.in);
		  Integer[] a = {1,3,5,1,7,6,5,4,3,2,4,6,5}; 
		  System.out.println("Enter the int to count: ");
		  int count =  sc.nextInt();
		  List<Integer> b = Arrays.asList(a);
		  int occurence = Collections.frequency(b,count);
		  
		  System.out.println(occurence);
		 
	     

	}

}
