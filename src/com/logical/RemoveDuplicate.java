package com.logical;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int count=0;
		int[] a = {0,1,8,1,2,3,4};
		String res = "";
		
		//Zero Finder 
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				
			if(a[i]==0 && a[j]==0){
				count+=1;
			}
		   }
		}
		
		if(count>0){
			res+="0";
		}

		for(int k=0;k<a.length;k++){
			for(int j=k+1;j<a.length;j++){
				if(a[k]==a[j]){
					a[j] = 0;
				}
			}
		}
		
		for(int w=0;w<a.length;w++){
			if(count > 0 && a[w]!=0){
				res+=a[w];
				}
			
		}
		
		System.out.println(res);
		
	}
		}



