package telran.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysInt {
//	public static int [] addNumber(int[] array, int number) {
//		int[] res = Arrays.copyOf(array, array.length + 1);
//		res[array.length] = number;
//		return res;
//	}
//public static int [] insertNumber(int[] array, int index, int number) {
//	int [] res = new int [array.length + 1];
//	System.arraycopy(array, 0, res, 0, index);
//	res[index] = number;
//	System.arraycopy(array, index, res, index +1, array.length - index);
//	return res;
//}
//public static int[] removeNumber(int [] array, int index) {
//	int [] res = new int [array.length - 1];
//	System.arraycopy(array, 0, res, 0, index );
//	System.arraycopy(array, index + 1 , res, index, array.length - index - 1 );
//	return res;
//}
//public static int [] insertNumberSorted(int[]arraySorted, int number) {
//	int index = Arrays.binarySearch(arraySorted, number);
//	if (index < 0) {
//		index = -(index + 1);
//	}
//	return insertNumber(arraySorted, index, number);
//}
//public static int searchNumber(int [] array, int number) {
//	int index = 0;
//	while(index < array.length && array[index] != number) {
//		index++;
//	}
//	return index < array.length ? index : -1 ;
//}
public static int binarySearchNumber(int []array, int number) {
	int left = 0;
	int right = array.length - 1;
	int middle = right / 2;
	int res = 0;
	int notFound = Arrays.binarySearch(array, number);
	while(left <= right && array[middle] != number) {
		if(number < array[middle]) {
			right = middle - 1;
		}else {
			left = middle +1;
		}
		middle = (left + right) / 2;
	}
//	res = firstIndex(array, middle);
	res = middle;
	
	return left <= right ? res : notFound;
}

//private static int firstIndex(int[] arr, int index) {
//	int res = 0;
//	for (int i = 0; i < arr.length - 1; i++) {
//        if (arr[i] == index) 
//            res = i;   
//      }
//	return res;
//	}
//private static int firstIndex(int[] array, int middle) {
//	return  Arrays.indexOf(array, middle);
//}
public static void quickSort(int[]array) {
	Arrays.sort(array);
}
public static void bubbleSort(int [] array) {
	int length = array.length;
	boolean flSorted = false;
	do {
		length--;
		flSorted = true;
		for(int i = 0; i< length; i++) {
			if(array[i] > array[i +1]) {
				swap(array, i, i + 1);
				flSorted = false;
			}
		}
	}while(!flSorted);
}
private static void swap(int[] array, int i, int j) {
	int tmp = array[i];
	array[i]= array[j];
	array[j]= tmp;
}
public static int getRandomInt(int min, int max) {
	Random gen = new Random();
	return gen.nextInt(min, max + 1);
}
public static int[] getRandomArray() {
int[] array = new int[1000000];
for (int i = 0; i < array.length; i ++) {
   array[i] = getRandomInt(1, 10);
}
return array;
}
}























