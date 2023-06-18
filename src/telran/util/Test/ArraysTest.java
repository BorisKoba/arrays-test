package telran.util.Test;
import static telran.util.Arrays.*;

import java.util.Arrays;
import java.util.Comparator;
import org.junit.jupiter.api.Test;

import telran.util.tests.EvenOddComparator;

import static org.junit.jupiter.api.Assertions.*;
public class ArraysTest {
	Integer[] numbers = {10, 5, -5, 100, 200};
	String[] strings = {"lmn", "a", "ab", "abc","b", "ba"}	;	
	
//@Test
//void addObjctTest() {
//	Integer[] expectedNumbers = {10, 5, -5, 100, 200, 50};
//	assertArrayEquals(expectedNumbers, addObject(numbers, 50));
//	String[] expectedStrings = {"lmn", "a", "ab", "abc","b", "ba", "bb"};
//	assertArrayEquals(expectedStrings, addObject(strings, "bb"));
//}
//@Test
//void insertObjectTest() {
//	Integer[] expectedLast = {10, 5, -5, 100, 200, 50};
//	Integer[] expectedFirst = {50, 10, 5, -5, 100, 200};
//	Integer[] expectedMiddle = {10, 5, 50, -5, 100, 200};
//	assertArrayEquals(expectedLast, insertObject(numbers, 5, 50));
//	assertArrayEquals(expectedMiddle, insertObject(numbers, 2, 50));
//	assertArrayEquals(expectedFirst, insertObject(numbers, 0, 50));
//}
//@Test
//void digitsSumComparatorTest() {
//	Comparator<Integer> comp = new DigitsSumComparator();
//	assertTrue(comp.compare(9, 66) < 0);
//	assertTrue(comp.compare(9, 111) > 0);
//	assertTrue(comp.compare(3, 111) == 0);
//}
//@Test
//void standartSortComparatorTest() {
//	Integer[] array = {10, 5, 110, 9, 22, 33};
//	Integer[] expected = {10, 110, 22, 5, 33, 9};
//	Arrays.sort(array, new DigitsSumComparator());
//	assertArrayEquals(expected, array);
//}

//@Test
//void bubbleSortComparatorTest() {
//	Integer [] expected = {10, 100, 200, 5, -5};
//	Integer [] array = {10, 5,-5, 100, 200};
//	bubbleSort(array, new EvenOddComparator());
//	assertArrayEquals(expected,array);
//}
//@Test
//void EvenOddComparatorTest() {
//	Comparator<Integer> comp = new EvenOddComparator();
//	assertTrue(comp.compare(4, 3) < 0);
//	assertTrue(comp.compare(7, 6) > 0);
//	assertTrue(comp.compare(5, 5) == 0);
//} 
//@Test
//void standardSortComparatorTest() {
//	Integer [] array = {10, 5, 110, 9, 22, 33};
//	Integer [] expected = {10, 110, 22, 5, 33, 9};
//	Arrays.sort(array, new DigitsSumComparator());
//	assertArrayEquals(expected, array);
//}
@Test
void bubbleSortComparatorTestLambda() {
	Integer [] expected = {10, 100, 200, 5, -5};
	Integer [] array = {10, 5,-5, 100, 200};
	bubbleSort(array, (a, b)-> compare(a, b));/*lambda expression*/
	bubbleSort(array, (o1, o2)-> {
		int res = 1;
	if (o1 % 2 == 0 && o2 % 2 != 0) {
		res = -1;
	} else if(o1 % 2 != 0 && o2 % 2 != 0) {
		res = o2 - o1;
	} else if(o1 % 2 == 0 && o2 % 2 == 0) {
		res = o1 - o2;
	}
	return res;
	});/*Lambda closure*/
	bubbleSort(array, ArraysTest::compare);/*Method reference*/
	System.out.println(Arrays.toString(array));
	assertArrayEquals(expected,array);
}
static private int compare(Integer o1, Integer o2) {
	int res = 1;
	if (o1 % 2 == 0 && o2 % 2 != 0) {
		res = -1;
	} else if(o1 % 2 != 0 && o2 % 2 != 0) {
		res = o2 - o1;
	} else if(o1 % 2 == 0 && o2 % 2 == 0) {
		res = o1 - o2;
	}
	return res;
}





















}
