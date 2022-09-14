package com.day3Practice;

public class Array1 {
	public static void main(String arg[])	
	{
	// Initialize array of random numbers and size
    // Suppose array named 'arr' contains 9 elements
    int[] arr = new int[] { -7, -5, 5, 10, 0, 3, 20, 25, 12 };
    
    System.out.println("Elements of given array are: ");

   
    for (int i = 0; i < arr.length; i++) {

        // Print array element present at index i
        System.out.print(arr[i] + " ");
    }
	}
}

