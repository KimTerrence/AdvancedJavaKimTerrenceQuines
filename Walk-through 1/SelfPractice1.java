//Kim Terrence Quines
//Self Practice 1: Modify the code to take user input for name and age.


import java.util.Scanner;

public class SelfPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String namesc = sc.next();
		
		System.out.print("Enter Age: ");
		int agesc = sc.nextInt();
		
		System.out.println("Name: " + namesc);
		System.out.println("Age: " + agesc);
		
		sc.close();
		
		}

}
