package com.chance.base;

import java.util.Arrays;

public class HeapSort {
	
	public static void adgustUp(int[] a, int i, int size){
		int left = (i << 1) + 1;
		int right = (i << 1) + 2;
		int largest = i;
		if(left<size && a[left]>a[largest])
			largest = left;
		if(right<size && a[right]>a[largest])
			largest = right;
		if(largest!=i){
			swap(a, largest, i);
			adgustUp(a, largest, size);
		}
	}
	
	public static void buildMaxHeap(int[] a){
		int size = a.length;
		for(int i = (size-2)>>1;i>=0;i--){
			adgustUp(a, i, size);
		}
	}
	
	public static void heapSort(int[] a){
		buildMaxHeap(a);
		for(int i = a.length-1;i>=0;i--){
			swap(a, 0, i);
			adgustUp(a, 0, i);
		}
	}
	
	public static void swap(int[] a,int i, int j){
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,3,1,9,3,7};
		heapSort(a);
		System.out.println(Arrays.toString(a));

	}

}
