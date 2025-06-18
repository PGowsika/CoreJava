package com.example;

import java.util.Scanner;

public class BinarySearch {

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
		
		//Scanner scn = new Scanner(System.in);
		System.out.println("\n enter the elemmnt to Binary Search");
		int searchValue = scn.nextInt();
		
		
		int left =0;
		int right = arr.length -1;
		
		int result = search(arr, left,right,searchValue);
		
		if(result != -1)
			System.out.println("found at Index : " + result);
		else 
			System.out.println("Not found");
	}
		static int search(int a[], int l, int r, int s)
		{
			
			int ind = -1;
			while(l <= r) 
			{
				
				int mid = (l + r )/2;
				if(a[mid] == s)
				{
					ind = mid;
					return ind;
				}
				else if (s< a[mid])
				{
					r = mid - 1;
				}
				else
				{
					l = mid + 1;
				}
				
			}
			return ind;
		}
		
	

}
