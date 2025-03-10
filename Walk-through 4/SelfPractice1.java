	import java.util.Arrays;
	import java.util.Scanner;
	
	public class SelfPractice1 {
	    public static int binarySearch(int[] arr, int key) {
	        int left = 0;
	        int right = arr.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2; 
	            if (arr[mid] == key) {
	                return mid;
	            }
	            if (arr[mid] < key) {
	                left = mid + 1; 
	            } else {
	                right = mid - 1;
	            }
	        }
	        return -1; 
	    }

	    public static void sortArray(int[] arr) {
	        Arrays.sort(arr);
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

	        sortArray(arr);
	        System.out.print("Sorted Array: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println(); 

	        System.out.print("Enter a number to search for: ");
	        int searchKey = scanner.nextInt();

	        int result = binarySearch(arr, searchKey);
	        if (result != -1) {
	            System.out.println("Element " + searchKey + " found at index: " + result);
	        } else {
	            System.out.println("Element " + searchKey + " not found in the array.");
	        }

	        scanner.close();
	    }
	}
