package com.example;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array declaration and accessing
		System.out.println("Single Dimensional Array");
		  int a[] = {10,20,30,40,50};
		  for(int i=0;i<a.length;i++)
			  System.out.println(a[i]);
		  
		  // Dynamic array 
		  System.out.println("Single Dimensional Array with user input");
		  int a1[] = new int[4]; 
		  Scanner s = new Scanner(System.in);
		  System.out.println("enter the array values");
		  
		  for(int i=0;i<a1.length;i++) 
			  a1[i] = s.nextInt();
		  
		  System.out.println("Print the array values"); 
		  
		  for(int i=0;i<a1.length;i++)
		 	System.out.println(a1[i]);
		 
		
		// 2-D Array
		  System.out.println("Two Dimensional Array");
		int x[][] = {{10,20},{30,40}};
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++)
				System.out.print(x[i][j] + "\t");
		
			System.out.println();
		}
		
		// Get Input and Print
		System.out.println("Two Dimensional Array with user input");
		int x1[][] = new int[2][2]; 
		//Scanner s = new Scanner(System.in);
		System.out.println("enter the array values");
		  
		for(int i=0;i<x1.length;i++) {
			for(int j=0;j<x1[i].length;j++)
				x1[i][j] = s.nextInt();
		}
				
		System.out.println("Print the array values");
		for(int i1=0;i1<x1.length;i1++) {
			for(int j=0;j<x1[i1].length;j++)
				System.out.print(x1[i1][j] + "\t");
			System.out.println();
		}
		
	}

}
