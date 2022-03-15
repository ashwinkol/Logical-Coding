package com.logical;
import java.util.*;

public class CharOccurenceNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Repeated Charcters: ");
		String s = sc.nextLine();
		char[] x = s.toCharArray();
		String a="";

      for(int i=0;i<x.length;i++){
    	  int count=1;
    	   
         if(x[i]!=' '){
    	
        //This will be True if x[i]!=' '
    	   
       for(int j=i+1;j<x.length;j++){
    		  
    	if(x[i]==x[j]){
    			  x[j]=' ';
    			  count+=1;
    		  }
    	 
        }//End Of Second For Loop
    	  a+=" ";
    	  a+=x[i];
    	  x[i]=' ';
    	  a+=count;
  

     }//End of First For Loop
  
  }// End Of If
	   System.out.println(a);

   
   } 
	
}
