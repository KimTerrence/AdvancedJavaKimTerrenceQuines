	import java.util.Scanner;
	
	public class GuidedTask3 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of rows for the first matrix: ");
	        int rowsA = scanner.nextInt();
	        System.out.print("Enter the number of columns for the first matrix: ");
	        int colsA = scanner.nextInt();

	        System.out.print("Enter the number of rows for the second matrix: ");
	        int rowsB = scanner.nextInt();
	        System.out.print("Enter the number of columns for the second matrix: ");
	        int colsB = scanner.nextInt();

	        if (colsA != rowsB) {
	            System.out.println("Matrix multiplication not possible. The number of columns in the first matrix must equal the number of rows in the second matrix.");
	            return;
	        }

	        int[][] matrixA = new int[rowsA][colsA];
	        int[][] matrixB = new int[rowsB][colsB];
	        int[][] productMatrix = new int[rowsA][colsB];

	        System.out.println("Enter the elements of the first matrix (Matrix A):");
	        inputMatrix(scanner, matrixA);

	        System.out.println("Enter the elements of the second matrix (Matrix B):");
	        inputMatrix(scanner, matrixB);

	        for (int i = 0; i < rowsA; i++) {
	            for (int j = 0; j < colsB; j++) {
	                for (int k = 0; k < colsA; k++) {
	                    productMatrix[i][j] += matrixA[i][k] * matrixB[k][j]; 
	                }
	            }
	        }

	        System.out.println("Product of the two matrices:");
	        printMatrix(productMatrix);

	        scanner.close();
	    }

	    public static void inputMatrix(Scanner scanner, int[][] matrix) {
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                System.out.print("Enter Element [" + i + "][" + j + "]: ");
	                matrix[i][j] = scanner.nextInt();
	            }
	        }
	    }

	    public static void printMatrix(int[][] matrix) {
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                System.out.print(matrix[i][j] + " "); 
	            }
	            System.out.println(); 
	        }
	    }
	}

