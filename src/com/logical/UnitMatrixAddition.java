package com.logical;

public class UnitMatrixAddition {

	//  1 2 3
	//  4 5 6
	//  7 8 9
	public static void main(String[] args) {

		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int addition = 0;
		for(int i = 0 ;i< a.length;i++) {
			for(int j = 0;j<a.length;j++) {
				if(i == j) {
					addition+=a[i][i];
					
				}
			}
		}
		System.out.println("Addtion is : "+addition);


	}

}
