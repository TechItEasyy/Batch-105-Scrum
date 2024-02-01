package com.scrum.zero;

public class SortAlgoTypes {
	//Bubble sort for ascending order
	public void bubbleSort(int []arr) {
		int size=arr.length;
		boolean swap=false;
		System.out.println("Array before bubble sort");
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
		//logic for bubble sort
		for(int i=0;i<size-1;i++) {
			swap=false;
			for(int j=0;j<size-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					swap=true;
				}
				
			}
			if(!swap)
				break;
		}
		//array after bubble sort
		System.out.println("\n"+"------------------------------------------------------------"+"\n");
		System.out.println("Array after bubble sort");
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
	}
	
	//Selection Sort
	
	public void selectionSort(int []arr) {
		int size=arr.length;
		int minIndex=0;
		int minValue=0;
		System.out.println("\n\n\n"+"Array before selection sort");
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
		//logic for selection sort
		
		for(int i=0;i<size;i++) {
			minValue=arr[i];
			for(int j=i;j<size;j++) {
				if(minValue>arr[j]) {
					minIndex=j;
				}
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
			
		}
		//array after Selection sort
				System.out.println("\n"+"------------------------------------------------------------"+"\n");
				System.out.println("Array after Selection sort");
				for(int i=0;i<size;i++)
					System.out.print(arr[i]+" ");
		
	}
	
	//Insertion Sort
	
	public void insertionSort(int []arr) {
		int size=arr.length;
		System.out.println("\n\n\n"+"Array before Insertion sort");
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
		//Logic for Insertion Sort
		
		for(int i=0;i<size-1;i++) {
			int insertVar=arr[i+1];
			int j=i;
			while(j>=0 && arr[j]>insertVar) {
				arr[j+1]=arr[j];
				j--;
				
				}
			arr[j+1]=insertVar;		
				
			}
		
		//array after Insertion sort
		System.out.println("\n"+"------------------------------------------------------------"+"\n");
		System.out.println("Array after Insertion sort");
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
	}

}
