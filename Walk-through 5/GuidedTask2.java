	import java.util.Scanner;
	
	public class GuidedTask2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of rows for the matrices: ");
	        int rows = scanner.nextInt();
	        System.out.print("Enter the number of columns for the matrices: ");
	        int cols = scanner.nextInt();

	        int[][] matrixA = new int[rows][cols];
	        int[][] matrixB = new int[rows][cols];
	        int[][] sumMatrix = new int[rows][cols];

	        System.out.println("Enter the elements of the first matrix (Matrix A):");
	        inputMatrix(scanner, matrixA);

	        System.out.println("Enter the elements of the second matrix (Matrix B):");
	        inputMatrix(scanner, matrixB);

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j]; 
	            }
	        }

	        System.out.println("Sum of the two matrices:");
	        printMatrix(sumMatrix);

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
