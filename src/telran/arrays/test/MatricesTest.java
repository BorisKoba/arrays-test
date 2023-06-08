package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;
import static telran.arrays.MatricesInt.*;
import org.junit.jupiter.api.Test;

class MatricesTest {

	@Test
	void multiplyConstantTest() {
		int[][] src = {
				{1, 10, 20},
				{30, -10, 15},
		};
		int[][] expected = {
				{2, 20, 40},
				{60, -20, 30}
		};
		assertArrayEquals(expected, multiplyConstant(src, 2));
	}
	@Test
	void getColumnTest() {
		int[][] src = {
				{1, 10, 20},
				{30, -10, 15},
		};
		int[] expected1 = {1, 30};
		int[] expected2 = {10, -10};
		int[] expected3 = {20, 15};
		assertArrayEquals(expected1, getColumn(src, 0));
		assertArrayEquals(expected2, getColumn(src, 1));
		assertArrayEquals(expected3, getColumn(src, 2));
	}
	@Test
	void transpMatrixTest() {
		int[][] src = {
				{1, 10, 20},
				{30, -10, 15}};
				int[][] expected = {
						{1, 30},
						{10, -10},
						{20, 15}
				};
				assertArrayEquals(expected, transpMatrix(src));
	
	}
}
