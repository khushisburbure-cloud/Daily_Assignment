package cotrollStatement;

//import the Scanner package
import java.util.Scanner;

public class AgeValidation_Task1 {

	public static void main(String[] args) {
		//create one object for the scanner class
		Scanner scan=new Scanner(System.in);
		 
		System.out.print("Enter the age of the voter :");
		
		//calling the scanner class object to get input from user
		int age=scan.nextInt();
		
		//logic for validating age of the voter using if-else loop
		if(age>=18) {
			System.out.print("ELEGIBLE");
		}
		else {
			System.out.print("NOT ELEGIBLE");
		}
		

	}

}
