	import java.util.Scanner;
	
	public class GuidedTasks1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of rows: ");
	        int rows = scanner.nextInt();
	        System.out.print("Enter the number of columns: ");
	        int cols = scanner.nextInt();

	        int[][] matrix = new int[rows][cols];

	        System.out.println("Enter the elements of the matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print("Element [" + i + "][" + j + "]: ");
	                matrix[i][j] = scanner.nextInt();
	            }
	        }

	        System.out.println("Matrix:");
	        printMatrix(matrix);

	        int sum = sumOfElements(matrix);
	        System.out.println("Sum of all elements in the matrix: " + sum);

	        scanner.close();
	    }

	    public static void printMatrix(int[][] matrix) {
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static int sumOfElements(int[][] matrix) {
	        int sum = 0;
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                sum += matrix[i][j]; 
	            }
	        }
	        return sum; 
	    }
	}


	