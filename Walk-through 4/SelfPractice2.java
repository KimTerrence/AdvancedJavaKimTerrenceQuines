	import java.util.Scanner;
	
	public class SelfPractice2 {
	    public static void insertionSort(String[] arr) {
	        for (int i = 1; i < arr.length; i++) {
	            String key = arr[i];
	            int j = i - 1;

	            while (j >= 0 && arr[j].compareTo(key) > 0) {
	                arr[j + 1] = arr[j];
	                j--;
	            }
	            arr[j + 1] = key; 
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number of strings: ");
	        int size = scanner.nextInt();
	        scanner.nextLine();
	        String[] arr = new String[size];

	        System.out.println("Enter strings:");
	        for (int i = 0; i < size; i++) {
	            System.out.print("String " + (i + 1) + ": ");
	            arr[i] = scanner.nextLine(); 
	        }

	        insertionSort(arr);

	        System.out.println("Sorted Array:");
	        for (String str : arr) {
	            System.out.println(str);
	        }

	        scanner.close();
	    }
	}
