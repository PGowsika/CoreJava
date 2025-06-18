package com.example;

import java.util.*;

public class ArrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter the size of the array");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		// Array element for the user
		for (int idx = 0; idx < arr.length; idx++) {
			System.out.println("Enter the array[" + idx +"] :  ");
		 	arr[idx]= scn.nextInt();
			
		}
		//Arrays.sort(arr);

		// Printing the Array 
		/*System.out.println("Print the array : ");
		for (int idx = 0; idx < arr.length; idx++) {

			System.out.print(arr[idx] + "\t ") ;
		}*/

		// Bubble sort ascending order
		for(int i=0; i<arr.length;i++)
		{
			for(int j= i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
				System.out.print(arr[i] + "\t " + arr[j]);
					System.err.println();
			}
		}
		// Print sorted array
		System.out.println("\n Ascending order of array : ");
		for (int idx = 0; idx < arr.length; idx++) {

			System.out.print(arr[idx] + "\t ");
		}



		// -------Bubble sort descending order-------
		/*for(int i=0; i<arr.length;i++)
		{
			for(int j= i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		// Print sorted array
		System.out.println("\n Descending order of array : ");
		for (int idx = 0; idx < arr.length; idx++) {

			System.out.print(arr[idx] + "\t");
		}*/

	}

}
