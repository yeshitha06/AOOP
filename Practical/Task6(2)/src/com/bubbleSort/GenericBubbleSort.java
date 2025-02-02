package com.bubbleSort;

import java.util.Arrays;
public class GenericBubbleSort {   
	    // Generic Bubble Sort Method
	    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
	        int n = array.length;
	        boolean swapped;
	        for (int i = 0; i < n - 1; i++) {
	            swapped = false;
	            for (int j = 0; j < n - 1 - i; j++) {
	                if (array[j].compareTo(array[j + 1]) > 0) {
	                    // Swap elements
	                    T temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                    swapped = true;
	                }
	            }
	            // If no swaps occurred, the array is sorted
	            if (!swapped) break;
	        }
	    }

	    // Test the method with different data types
	    public static void main(String[] args) {
	        // Test with Integers
	        Integer[] intArray = {5, 2, 9, 1, 5, 6};
	        bubbleSort(intArray);
	        System.out.println("Sorted Integers: " + Arrays.toString(intArray));
	        
	        // Test with Doubles
	        Double[] doubleArray = {3.2, 1.5, 4.7, 2.8, 0.9};
	        bubbleSort(doubleArray);
	        System.out.println("Sorted Doubles: " + Arrays.toString(doubleArray));
	        
	        // Test with Strings
	        String[] stringArray = {"banana", "apple", "cherry", "date"};
	        bubbleSort(stringArray);
	        System.out.println("Sorted Strings: " + Arrays.toString(stringArray));
	    }
}
