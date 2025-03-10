//Kim Terrence Quines
//Guided Task 3: Reverse an array using a loop.

public class GuidedTask3{
    public static void main(String[] args){
        int[] numbers = {5, 4, 3, 2, 1};

        System.out.println("Original Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        int length = numbers.length;
        for(int i = 0; i < length / 2; i++){
            int tempo = numbers[i];
            numbers[i] = numbers[length - i - 1];
            numbers[length - i - 1] = tempo;
        }
        System.out.println("\nReversed Array: ");
        for(int num : numbers){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}