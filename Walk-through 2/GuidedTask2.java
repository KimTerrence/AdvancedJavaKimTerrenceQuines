//Kim Terrence Quines
//Guided Task 2

import java.util.Scanner;

public class GuidedTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number from 1 to 7 to get the corresponding day: ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;        
            default:
                System.out.println("Invalid! Please enter a number between 1 and 7.");
        }
        sc.close();
    }
}
