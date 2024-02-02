package com.scrum.zero;

public class Factorial {
	public void factorial(int m) {
		int fact=1;
		int n=m;
		if(n==0 || n==1)
			System.out.println("factorial of "+m+"  is"+"  "+fact);
		
		while(n>0) 
				fact*=n--;
		
			
		System.out.println("factorial of "+m+"  is"+"  "+fact);
	}

}
