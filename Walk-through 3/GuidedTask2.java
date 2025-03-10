
//Kim Terrence Quines
//Guided Task 2: Find the maximum and minimum value in an array. 

public class GuidedTask2{
    public static void main(String[] args){
        int[] numbers = {5, 2, 3, 1, 4};
        int minnum = numbers[0];
        int maxnum = numbers[0];

        for(int num : numbers){
            if(num < minnum){
                minnum = num;
            }
            if(num > maxnum){
                maxnum = num;
            }
        }
        System.out.println("Array Elements: ");
        for(int num : numbers){
            System.out.println(num + " ");
        }
        System.out.println("Minimum : " + minnum);
        System.out.println("Maximum : " + maxnum);
    }
}