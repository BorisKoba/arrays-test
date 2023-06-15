package telran.util;
import static java.util.Arrays.*;

import java.util.Comparator;






public class Arrays {
	public static <T> T[] addObject(T[] array, T obj) {
		T[] res = copyOf(array, array.length + 1);
		res[array.length] = obj;
		return res;
	}
	public static <T> void bubbleSort(T[] array, Comparator<T> comp) {
		boolean flSorted = false;
		int length = array.length;
		do {
			flSorted = true;
			length--;
			for(int i = 0; i < length; i++) {
				if(comp.compare(array[i], array[i + 1]) > 0) {
					flSorted = false;
					swap(array, i, i + 1);
				}
			}
		}while(!flSorted);
	}
	private static <T> void swap(T[] array, int i, int j) {
		T tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
}
//	private static <T> void swapLess(T[]array, int i, int j) {
//		T tmp = array[j];
//		array[j] = array[i];
//		array[i] = tmp;
//	}
	
	
	
	
	
	
	
	
	
	
