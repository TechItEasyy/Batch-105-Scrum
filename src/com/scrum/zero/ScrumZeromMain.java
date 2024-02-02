package com.scrum.zero;

import com.scrum.guessnumber.GuessTheNumber;

public class ScrumZeromMain {

	public static void main(String[] args) {

		//take a dummy array
		int [] arr0=new int[] {5,1,-12,10,9,23,-35};
		SortAlgoTypes sortType=new SortAlgoTypes();
		sortType.bubbleSort(arr0);
		//dummy array
		int [] arr1=new int[] {5,1,-12,10,9,23,-35};
		sortType.selectionSort(arr1);
		//dummy array
		int [] arr2=new int[] {5,1,-12,-10,9,23,-35};
		sortType.insertionSort(arr2);
		//dummy array
		int [] arr3=new int[] {5,1,-12,-10,9,23,-35};
		sortType.mergeSort(arr3,0,arr3.length-1);

		System.out.println("Hello Zero!!");
	
		ArrayOperation arr = new ArrayOperation();
		arr.arrayOperation();


		GuessTheNumber test = new GuessTheNumber();
		test.playGame();


	}
 }




	


