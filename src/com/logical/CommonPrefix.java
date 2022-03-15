package com.logical;

public class CommonPrefix {

	public static void main(String[] args) {
		 
        String[] str = {"ab","a"};
        int x =0;
        int a = 0;
        int ans = 0;
        int tmp =0;
        String fi = "";
        
        for(int i = 0;i<str[0].length();i++) {
        	
            a =(int)str[0].charAt(x);
            ans = a*str.length;
             
             /*for(int j=0;j<str.length;j++) {
                 tmp +=(int)(str[j].charAt(x)); 
             }
             */
            
            tmp +=(int)(str[1].charAt(0)); 

        
             if(tmp == ans) {
                char ab = (char)(tmp/str.length);
                fi+=ab;
                tmp=0;
                ans=0;
                x+=1;
             }
             
             
            
        }
        System.out.println("The Ans Is : "+fi);
        
	}

}
