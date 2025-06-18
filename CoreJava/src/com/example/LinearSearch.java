package com.example;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the array");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		int index = -1 ;
		boolean flag =false;
		// Array element for the user
		for (int idx = 0; idx < arr.length; idx++) 
		{
			System.out.println("Enter the array[" + idx +"] :  ");
		 	arr[idx]= scn.nextInt();
			
		}
		System.out.println("Enter element to search : ");
		int find = scn.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==find)
			{
				flag = true;
				index =i;
				break;
			}
			
		}
		if(flag)
			System.out.println("found at Index : " + index);
		else 
			System.out.println("Not found");
		
	}

}
