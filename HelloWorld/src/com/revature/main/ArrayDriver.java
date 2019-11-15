package com.revature.main;

import java.util.Arrays;

public class ArrayDriver {
	
	// An Array is an Object
	// Contiguous block of memory
	// A collection of like objects/values
	// Contiguous block of memory allows for random access.
	public static void main(String args[]) {
		int[] intArr = new int[200];
		int[] intArr2 = {0,1,2,3};
		
		System.out.println(intArr2[3]);
		
		for (int x = 0; x < intArr2.length; x++) {
			System.out.println(intArr2[x]);
		}
		
		intArr2[0] = -65;
		
		// enhanced for loop
		// adding or removing elements breaks things while doing this.
		for (int x : intArr2) {
			System.out.println(x);
		
		
		// You can have as many dimensions in your array as you want.
		int[][] matrix = new int[10][12];
		
		// Creates an array of length 10 that contains all nulls.
		int[][] matrix2 = new int[10][];
		// Stores an array of length 3 in the 4th position of the 1st array.
		matrix2[0] = new int[3];
		matrix2[1] = new int[2];
		
		int matrix3[][][][][][][] = new int[1][2][3][4][][][];
		
		// Arrays is a utility class. 
		System.out.println("index: " + Arrays.binarySearch(intArr2, 2));
		
		
		System.out.println("Start of testing Arrays class methods");
		int[] testArr1 = {12, 2, 7, 4};
		int[] testArr2 = {2, 4, 7, 12};
		int[] testArr = {12, 2, 7, 4};
		System.out.println("Original testArr");
		for (int y : testArr) {
		System.out.println(y);
		}
		System.out.println();
		System.out.println("Sorted testArr");
		Arrays.sort(testArr);
		for (int z : testArr) {
		System.out.println(z);
		}
		System.out.println();
		System.out.println("Index of value 7");
		int index = Arrays.binarySearch(testArr, 7);
		System.out.println(index);
		System.out.println();
		// Cannot sort in reverse order.
		/*
		Arrays.sort(testArr, 3, 0);
		for (int z2 : testArr) {
		System.out.println(z2);
		}
		System.out.println();
		*/
		System.out.println("Testing equality of sorted testArr to unsorted testArr");
		System.out.println(Arrays.equals(testArr, testArr1));
		System.out.println("Testing equality of sorted testArr to newly declared sorted testArr");
		System.out.println(Arrays.equals(testArr, testArr2));
		System.out.println();
		String[] strArr = {"Hello", "There"};
		String[] strArr2 = {"Hello", "There"};
		String[] strArr3 = {"There", "Hello"};
		System.out.println("Testing deepEquals which requires arrays of objects...");
		System.out.println("Testing whether two different arrays containing strings in same order are the same or not");
		System.out.println(Arrays.deepEquals(strArr, strArr2));
		System.out.println("Testing whether two different arrays containing strings in different order are the same or not");
		System.out.println(Arrays.deepEquals(strArr, strArr3));
		System.out.println();
		System.out.println("Arrays.fill...");
		Arrays.fill(testArr, 5);
		for (int z2 : testArr) {
			System.out.println(z2);
			}
		}
	}
}
