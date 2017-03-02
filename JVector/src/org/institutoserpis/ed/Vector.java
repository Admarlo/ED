package org.institutoserpis.ed;

import java.util.ArrayList;

public class Vector {

	public static void main(String[] args) {
		int index = indexOf(new int[]{32, 15, 7, 9, 12}, 99);
		System.out.println("Vector index=" + index);
		
		
	}
	
	public static int binarySearch(int[]v, int data) {
		return -1;
	}
	
	public static int indexOf(int[]v, int data) {
		//Wirth Algoritmos y Estructuras de datos
//		int index = 0;
//		while (index < v.length && v[index] != data)
//			index++;
//		if (index == v.length)
//			return -1;
//		return index;
		
		int index = 0;
		for (int item : v) {
			if (item == data)
				return index;
			index++;
		}
		return -1;
	}
	
	public static int min(int[] v) {
		int min = v[0];
//		for (int index = 1; index < v.length ; index++)
//			if (v[index] < min)
//				min = v[index];
		for (int item : v)
			if (item < min)
				min = item;
		return min;
	}
	
	public static void selectionSortUgly(int[] v) {
		for (int itemIndex = 0; itemIndex < v.length - 1; itemIndex++) {
			int indexOfMin = itemIndex;
			for (int index = itemIndex + 1; index < v.length; index++)
				if (v[index] < v[indexOfMin])
					indexOfMin = index;
			int aux = v[itemIndex];
			v[itemIndex] = v[indexOfMin];
			v[indexOfMin] = aux;
		}
	}

	private static int indexOfMin(int[] v, int initialIndex) {
		int indexOfMin = initialIndex;
		for (int index = initialIndex + 1; index < v.length; index++)
			if (v[index] < v[indexOfMin])
				indexOfMin = index;
		return indexOfMin;
	}
	
	private static void swap(int[] v, int indexOne, int indexTwo) {
		int aux = v[indexOne];
		v[indexOne] = v[indexTwo];
		v[indexTwo] = aux;
	}
	
	public static void selectionSort(int[] v) {
		for (int itemIndex = 0; itemIndex < v.length - 1; itemIndex++) {
			int indexOfMin = indexOfMin(v, itemIndex);
			swap(v, itemIndex, indexOfMin);
		}
	}
}
