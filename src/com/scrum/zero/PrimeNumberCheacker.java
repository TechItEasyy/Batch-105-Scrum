package com.scrum.zero;
import java.util.Scanner;

public class PrimeNumberCheacker {

	int xx;
	int yy = 0;

    public void PrimeNumber() {
    
	System.out.println("Enter Any Number");
	Scanner sc = new Scanner(System.in);
	xx = sc.nextInt();
	
	for(int i=1;i<=xx;i++) {
		
		if(xx %i==0)
		{
        yy++;       
	}	
}
       if(yy==2)
    System.out.println("Number is a...PRIME");
       else
    System.out.println("Number is NOT a...PRIME");	   
    }
    

}
