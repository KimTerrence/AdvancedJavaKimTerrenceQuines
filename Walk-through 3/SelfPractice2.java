//Kim Terrence Quines
//Self Practice 2: Implement a program to remove duplicates from array.

import java.util.Arrays;

public class SelfPractice2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8};

        Arrays.sort(numbers);

        int[] tempo = new int[numbers.length];
        int j = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] != numbers[i + 1]) {
                tempo[j++] = numbers[i];
            }
        }
        tempo[j++] = numbers[numbers.length - 1]; 

        int[] uniqueArray = Arrays.copyOf(tempo, j);

        System.out.println("Array without duplicates: ");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
