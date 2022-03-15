package  com.logical;
public class Reverse_String_By_Array {
	public static void main(String[] args) {
		
		String a = "india is the country";
		String[] b;
		
		//REverse the Words
		StringBuffer sb = new StringBuffer(a);
				
		b = a.split(" ");
		
		for(int i =b.length-1;i>=0;i--){
		System.out.print(" "+b[i]);
		}
	}

}
