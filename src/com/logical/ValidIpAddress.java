package com.logical;

public class ValidIpAddress {

    public static boolean pattern(String input){
    	char[] inputChar = input.toCharArray();
    	
    	if(input.endsWith(".")) {
    		return false;
    	}
    	
    	String[] in =  input.split("[.]");
    	
        if(in.length == 4 && in.length < 4){
            return false;
        }
        boolean isValidIp = false;
        int[] ips = new int[4];
        
        for(int i = 0;i < in.length;i++){
        	try {
        		 ips[i] = Integer.parseInt(in[i]);
        	}
        	catch (NumberFormatException e) {
				
        		return false;
			}
        	catch (ArrayIndexOutOfBoundsException  e) {
				// TODO: handle exception
        		return false;
			}
           
        }
        
        for(int ip : ips){
            if(ip > -1 && ip < 256){
             isValidIp = true;   
            }
            else {
               return false;
            }
        }
        
        return isValidIp;
        
        
    }
    public static void main(String[] args){
        
    	
        	System.out.println(pattern("00.12.123.123123.123"));

    	
        
    }
}
