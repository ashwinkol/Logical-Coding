package com.logical;

import java.util.*;

public class QuickSort {
	
	public static int partition(int[] arr, int start, int end) {
	
		int pivot = arr[end];
		int i = (start - 1);
		
		for (int j = start; j < end; j++) {
			
			if(arr[j] < pivot) {
				
				i++;
				
				int tmp = arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
			}
			
		}
		
		int tmp = pivot;
		pivot = arr[i+1];
		arr[i+1] = tmp;
		
		
		return (i+1);
		
	}
	
	public static void quickSort(int[] arr,int start, int end) {
		
		if(start < end) {
			
			int pivot = partition(arr, start, end);
			
			quickSort(arr, start, pivot-1);
			quickSort(arr,pivot+1,end);
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,2,1,2,2,3,4,5};
		System.out.println("Before Quic Sort: "+Arrays.toString(arr));
		quickSort(arr, 0, arr.length-1);
		System.out.println("After Quick Sort: "+Arrays.toString(arr));

	}
}