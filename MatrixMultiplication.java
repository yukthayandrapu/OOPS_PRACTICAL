package oops_programs;

public class MatrixMultiplication {
	    // Method to multiply two matrices
	    void multiply(int[][] A, int[][] B) {
	        int rowsA = A.length;
	        int colsA = A[0].length;
	        int colsB = B[0].length;

	        int[][] result = new int[rowsA][colsB];

	        // Matrix multiplication logic
	        for (int i = 0; i < rowsA; i++) {
	            for (int j = 0; j < colsB; j++) {
	                for (int k = 0; k < colsA; k++) {
	                    result[i][j] += A[i][k] * B[k][j];
	                }
	            }
	        }

	        // Display the result
	        System.out.println("Result of Matrix Multiplication:");
	        for (int[] row : result) {
	            for (int val : row) {
	                System.out.print(val + " ");
	            }
	            System.out.println();
	        }
	    }

	    // Main method
	    public static void main(String[] args) {
	        int[][] matrix1 = {
	            {1, 2},
	            {3, 4}
	        };

	        int[][] matrix2 = {
	            {5, 6},
	            {7, 8}
	        };

	        MatrixMultiplication obj = new MatrixMultiplication();
	        obj.multiply(matrix1, matrix2);
	    }
	}


