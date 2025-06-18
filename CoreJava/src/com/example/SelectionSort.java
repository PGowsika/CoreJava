package com.example;

import java.util.*;

public class SelectionSort {

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
 // -------------------------SELECTION SORT------------------
        for(int i=0;i<arr.length-1;i++)
        {
            int ind = i;
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[ind]>arr[j])
                {
                    ind=j; 
                }
            }
            int temp =arr[ind];
            arr[ind] =arr[i];
            arr[i] = temp;
        }

		// Printing the Array 
		System.out.println("Selection sort of array : ");
		for (int idx = 0; idx < arr.length; idx++) {

			System.out.print(arr[idx] + "\t ") ;
		}
	}
}
