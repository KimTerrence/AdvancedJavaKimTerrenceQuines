	import java.util.Scanner;
	public class SelfPractice1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the square matrix (n x n): ");
	        int n = scanner.nextInt();

	        int[][] matrix = new int[n][n];

	        System.out.println("Enter the elements of the matrix:");
	        inputMatrix(scanner, matrix);

	        boolean isSymmetric = checkSymmetry(matrix);

	        if (isSymmetric) {
	            System.out.println("The matrix is symmetric.");
	        } else {
	            System.out.println("The matrix is not symmetric.");
	        }

	        scanner.close();
	    }

	    public static void inputMatrix(Scanner scanner, int[][] matrix) {
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                System.out.print("Enter Element [" + i + "][" + j + "]: ");
	                matrix[i][j] = scanner.nextInt(); // User inputs each element
	            }
	        }
	    }

	    public static boolean checkSymmetry(int[][] matrix) {
	        int n = matrix.length; 
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (matrix[i][j] != matrix[j][i]) {
	                    return false; 
	                }
	            }
	        }
	        return true; 
	    }
	}
