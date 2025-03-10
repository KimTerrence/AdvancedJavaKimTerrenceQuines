//Kim Terrence Quines
//Self Practice 1: Write a program that merges two arrays.

public class SelfPractice1{
    public static void main(String[] args){
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {60, 70, 80, 90, 100};
        
        int mergedLength = array1.length + array2.length;
        int[] mergedArray = new int[mergedLength];
     
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }
        System.out.println("Merged Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}