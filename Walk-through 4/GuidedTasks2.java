	import java.util.Scanner;
	
	public class GuidedTasks2 {
	    public static int linearSearch(int[] arr, int key) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == key) {
	                return i; 
	            }
	        }
	        return -1; 
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number:");
	        int size = scanner.nextInt();
	        int[] arr = new int[size];

	        System.out.println("Enter elements:");
	        for (int i = 0; i < size; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            arr[i] = scanner.nextInt();
	        }

	        System.out.print("Enter a number to search for: ");
	        int searchKey = scanner.nextInt();

	        int result = linearSearch(arr, searchKey);
	        if (result != -1) {
	            System.out.println("Element " + searchKey + " found at index: " + result);
	        } else {
	            System.out.println("Element " + searchKey + " not found in the array.");
	        }

	        scanner.close();
	    }
	}
