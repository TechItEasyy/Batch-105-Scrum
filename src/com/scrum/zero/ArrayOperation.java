package com.scrum.zero;

public class ArrayOperation {
	  
	
	public void arrayOperation() {
		
		int[] array = {2,4,6,8,10};

        int length = array.length;
        int sum = 0;
        
        for (int i=0; i<length; i++){
       	sum = sum + array[i];
      }
        System.out.println("sum of elements of array :" + sum);
       
        float average = sum/length;
	
        System.out.println("average of elements of array :" + average);
	
            int max = array[1];
			if(max<array[max]){
			max=array[max];
	  }
    	 System.out.println("maximum of elements of array :" + max);
      }
  }





 
