package com.logical;
import java.util.*;

//StrongNumber Means Addition of factorilas
// Ex: 145   1! 4! 5! = 145 Strong Number!!
public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a = sc.nextInt();
		int b = a;
		int ans=0;
		while(a > 0){
			int temp =1;
			
			int r = a%10;
			
			for(int i=1;i<=r;i++){
				temp = temp*i;
			}
			
			ans +=temp;
			a= a/10;
		}
		
		if(ans == b){
		 System.out.println(ans+" Strong umber");
		}
		
	}

}
