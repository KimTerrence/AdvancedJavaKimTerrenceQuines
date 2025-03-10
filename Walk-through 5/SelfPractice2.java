	import java.util.Scanner;
	
	public class SelfPractice2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of rows for the matrix: ");
	        int rows = scanner.nextInt();
	        System.out.print("Enter the number of columns for the matrix: ");
	        int cols = scanner.nextInt();

	        int[][] matrix = new int[rows][cols];

	        System.out.println("Enter the elements of the matrix:");
	        inputMatrix(scanner, matrix);

	        int[][] transposedMatrix = transposeMatrix(matrix);

	        System.out.println("Transposed Matrix:");
	        printMatrix(transposedMatrix);

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

	    public static int[][] transposeMatrix(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;
	        int[][] transposed = new int[cols][rows]; 

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                transposed[j][i] = matrix[i][j]; 
	            }
	        }
	        return transposed;
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
