package com.logical;

public class PrimeNumberWithTwist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 16;
		int count = 0;
		for(int i = 1; i<=a; i++)
		{
			for(int k = 2; k<=i; k++)
			{
				if(i == 1)
				{
					System.out.println(i);
					count++;
				}
				else if(i%k != 0)
				{
					System.out.println(i);
					count++;
					break;
				}
				break;
			}
		}System.out.println(count);

	}

}
