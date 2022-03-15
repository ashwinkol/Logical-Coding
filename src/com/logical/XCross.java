package com.logical;

public class XCross {
	public static void main(String[] args) {
		//First For Loop to print V Shape
		for(int i=1;i<=3;i++){
			
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			System.out.print(i);
			
			for(int j=i;j<=3;j++){
				System.out.print("  ");

			}
			System.out.print(i+" ");
            System.out.println();
            
            
            // Print 4 
            if(i==3){
            	
            	for(int q=1;q<=4;q++){
            		
            		System.out.print(" ");
            	}
				System.out.print(" 4");

				System.out.println();

			}

		}
		
		
		//Second Fro loop to print the A Like Structure
		
		for(int i=3;i>0;i--){
			
			for(int j=1;j<i;j++){
				System.out.print(" ");
				}
			for(int k=i;k>=i;k--){
				System.out.print("  "+i);
              }
			
			for(int t=i;t<=3;t++){
				System.out.print("  ");
			}
			System.out.print(i);
			
			System.out.println();
		}
		
		
		
	}

}
