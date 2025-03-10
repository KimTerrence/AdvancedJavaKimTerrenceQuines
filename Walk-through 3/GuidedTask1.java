
//Kim Terrence Quines
//Guided Task 1: Create an array of 5 student grades and calculate the average.

public class GuidedTask1{
    public static void main(String[] args){
        int[] grades = {90, 78, 83, 96, 87};
        int sum = 0;

        for(int grade : grades){
            sum += grade;
        }
        int average = sum / grades.length;

        System.out.println("Student Grades: ");
        for(int i = 0; i < grades.length; i++){
            System.out.println("Student " + (i + 1) + ": " + grades[i]);
        }
        System.out.println("Average Grade: " + average);
    }
}