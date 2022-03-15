package com.logical;

public class RemoveDuplicateTest {
   public static void main(String[] args) {
	int[] a = {1,3,2,6,1,1,3,2,4,6,1,1,1,1,0,32,1,4,5};
	
	for(int i=0;i<a.length;i++){
		for(int j=i+1;j<a.length;j++){
			if(a[i]==a[j]){
				a[j]=0;
			}
		}
	}
	
	for(int i=0;i<a.length;i++){
		if(a[i]!=0){
			System.out.print(i);
		}
	}
}

}
