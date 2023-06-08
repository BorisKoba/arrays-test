package telran.arrays;

public class MatricesInt {
public static int[][] multiplyConstant(int[][]matrix, int constant){
	for(int i = 0; i < matrix.length; i++ ) {
		for(int j = 0; j < matrix[i].length; j++) {
			matrix[i][j] *= constant;
		}
	}
	return matrix;
}
public static int[] getColumn(int[][] matrix, int column) {
	int index = 0;
	int[] res = new int[2];
	for(int i = 0; i < matrix.length; i++ ) {
		for(int j = 0; j < matrix[i].length; j++) {
			if(matrix[i][j] == matrix[i][column] ) {
				res[index] = matrix[i][j];
				index++;
			}
			 
			}
		}
	return res;
}
public static int[][] transpMatrix(int[][]matrix){
	int[][] resMatrix = new int[3][2];
	for(int i = 0; i < resMatrix.length; i++ ) {
		for(int j = 0; j < resMatrix[i].length; j++) {
			
			resMatrix[i][j] = matrix[j][i];
		}
	}return resMatrix;
}
}
