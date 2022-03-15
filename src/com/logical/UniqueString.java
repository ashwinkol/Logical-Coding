package com.logical;

public class UniqueString {
	
public boolean isUniqe(String a ) {
		
		if(a.length() > 128) return false;
		
		boolean[] b = new boolean[128];
		
		for(int i = 0;i<a.length();i++) {
			int x = a.charAt(i);
			if(b[x]) return false;
			
			b[x] = true;
			
			
		}
		
		return true;
}
	public static void main(String[] args) {
		
		UniqueString test  = new UniqueString();
		System.out.println(test.isUniqe("ab"));
		
		
		
		
	}
	
	
	
	}


