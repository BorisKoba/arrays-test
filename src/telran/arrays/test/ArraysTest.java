package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import telran.arrays.ArraysInt;



public class ArraysTest {
//	@Test
//	void initialTest() {
//		int [] ar1 = {1, 2, 3};
//		int [] ar2 = {1, 2, 3};
//		int [] ar2_3 = ar2;
//		assertFalse(ar1 == ar2);
//		assertTrue(ar2==ar2_3);
//		assertArrayEquals(ar1,ar2);
//		ar2_3[0] = 10;
//		ar1[0] = 10;
//		assertArrayEquals(ar1,ar2);
//	}
//	@Test
//	void copyOfIntTest() {
//		int [] ar1 = {10, 5, 15};
//		int [] expected1 = {10, 5, 15};
//		int [] expected2 = {10, 5};
//		int [] expected3 = {10, 5, 15, 0, 0};
//		assertArrayEquals(expected1, Arrays.copyOf(ar1, 3));
//		assertArrayEquals(expected2, Arrays.copyOf(ar1, 2));
//		assertArrayEquals(expected3, Arrays.copyOf(ar1, 5));
//	}
//	@Test
//	void addNumberTest() {
//		int [] ar1 = {10, 5, 15};
//		int number = 20;
//		int [] expected = {10, 5, 15, number};
//		assertArrayEquals(expected, ArraysInt.addNumber(ar1, number));
//		}
//	@Test
//	void arrayCopyTest() {
//		int [] src = {1, 2, 3, 4, 5, 6, 7};
//		int [] dest = {10, 20, 30, 40, 50, 60, 70};
//		int [] expected = {10, 20, 30, 40, 1, 2, 3};
//		System.arraycopy(src, 0, dest, 4, 3);
//		assertArrayEquals(expected, dest);
// }
//	@Test
//	void insertNumberTest() {
//		int [] src = {1, 2, 3, 4, 5, 6, 7};
//		int number = 20;
//		int index = 3;
//		int[] expected1 = {1, 2, 3, 20, 4, 5, 6, 7};
//		assertArrayEquals(expected1, ArraysInt.insertNumber(src, index, number));
//		number = 30;
//		index = 0;
//		int[] expected2 = {30, 1, 2, 3, 4, 5, 6, 7};
//		assertArrayEquals(expected2, ArraysInt.insertNumber(src, index, number));
//		number = 40;
//		index = 7;
//		int [] expected3 = {1, 2, 3, 4, 5, 6, 7, 40};
//		assertArrayEquals(expected3, ArraysInt.insertNumber(src, index, number));
//	}
//	@Test 
//	void removeNumberTest(){
//		int [] src = {1, 2, 3, 4, 5, 6, 7};
//		int index = 1;
//		int[] expected1 = {1, 3, 4, 5, 6, 7};
//		assertArrayEquals(expected1, ArraysInt.removeNumber(src, index));
//		index = 3;
//		int[] expected2 = {1, 2, 3, 5, 6, 7};
//		assertArrayEquals(expected2, ArraysInt.removeNumber(src, index));
//		index = 6;
//		int [] expected3 = {1, 2, 3, 4, 5, 6};
//		assertArrayEquals(expected3, ArraysInt.removeNumber(src, index));
//	}
//	@Test
//	void binarySearchTest() {
//		int [] array = {10, 20, 30, 40, 50, 60, 70};
//		int number = 10;
//		assertEquals(0, Arrays.binarySearch(array, number));
//		number = 40;
//		assertEquals(3, Arrays.binarySearch(array, number));
//		number = 70;
//		assertEquals(6, Arrays.binarySearch(array, number));
//		assertEquals(-1, Arrays.binarySearch(array, 5));
//		assertEquals(-5, Arrays.binarySearch(array, 45));
//		assertEquals(-7, Arrays.binarySearch(array, 65));
//		
//	}
//	@Test
//	void insertSortedTest() {
//		int [] array = {10, 20, 30, 40, 50, 60, 70};
//		int [] expected1 = {5, 10, 20, 30, 40, 50, 60, 70};
//		int [] expected2 = {10, 20, 30, 35, 40, 50, 60, 70};
//		int [] expected3 = {10, 20, 30, 40, 50, 60, 65, 70};
//		assertArrayEquals(expected1, ArraysInt.insertNumberSorted(array, 5));
//		assertArrayEquals(expected2, ArraysInt.insertNumberSorted(array, 35));
//		assertArrayEquals(expected3, ArraysInt.insertNumberSorted(array, 65));
//	}
	
	
//	@Test
//	@Timeout(3)
//	void maxLongTest() {
//		assertEquals(Long.MAX_VALUE, getLongMax());
//	}
//	private long getLongMax() {
//		long res = 1;
//		while(res > 0) {
//			res *= 2;
//		}
//		
//		return res - 1;
//	}
//	@Test
//	void maxIntTest() {
//		assertEquals(Integer.MAX_VALUE, getIntMax());
//	}
//	private int getIntMax() {
//		int res = 1;
//		while(res > 0) {
//			res++;
//		}
//		
//		return res - 1;
//	}
	@Test
	void binarySearchNumberTest() {
		int [] array = {10, 20, 30, 40, 50, 60, 70, 70, 70, 70};
		int number = 10;
		assertEquals(0, ArraysInt.binarySearchNumber(array, number));
		number = 40;
		assertEquals(3, ArraysInt.binarySearchNumber(array, number));
		number = 70;
		assertEquals(6, ArraysInt.binarySearchNumber(array, number));
		assertEquals(-1, ArraysInt.binarySearchNumber(array, 5));
		assertEquals(-5, ArraysInt.binarySearchNumber(array, 45));
		assertEquals(-7, ArraysInt.binarySearchNumber(array, 65));
		
	}
	//@Test
//	void quickSortTest() {
//		int [] array = {70, 10, 30, 60, 40, 50, 20};
//		int [] expected1 = {10, 20, 30, 40, 50, 60, 70};
//		assertTrue(expected1 , ArraysInt.quickSort(array));
//		
//		
//		
//	}

		
	}
	
	
	
	
	
	
	

