	import java.util.Scanner;
	
	public class GuidedTasks1 {
	    public static void selectionSort(int[] arr) {
	        for (int i = 0; i < arr.length - 1; i++) {
	            int minIndex = i; 
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j; 
	                }
	            }
	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int size = scanner.nextInt();
	        int[] arr = new int[size];

	        System.out.println("Enter elements:");
	        for (int i = 0; i < size; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            arr[i] = scanner.nextInt();
	        }

	        selectionSort(arr);
	        
	        System.out.print("Sorted Array (Selection Sort): ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println(); 

	        scanner.close();
	    }
	}
