package com.scrum.zero;

import java.util.Scanner;

public class CalculatorDesign {
	
	public void calculatorOperation(){
		
		 int n1,n2,ch,cal;
	     System.out.print("Enter two numbers");
		 Scanner sc = new Scanner(System.in);
	     n1=sc.nextInt();
	     n2=sc.nextInt();
	     System.out.print("Select operation");
	     ch=sc.nextInt();
	     
	     if(ch==1){
	    	cal=n1+n2;
	     System.out.print("addition"+ cal);
	      
	     }else if(ch==2){
	    	 cal=n1-n2;
	     System.out.print("SUBTRACTION"+ cal);
	      
	     }else if(ch==3){
	    	 cal=n1*n2;
	     System.out.print("MULTIPLICATION" +cal);
	    	 
	     }else if(ch==4){
	    	 cal=n1/n2;
	     System.out.print("DIVISION" +cal);
	    	 
	    }else{
	     cal=n1%n2;
	     System.out.print("REMAINDER" +cal);
	    	 
	    	 
	     }
		
		
		
		
	}

}
