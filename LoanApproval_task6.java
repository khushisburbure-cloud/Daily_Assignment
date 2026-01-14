package cotrollStatement;
import java.util.Scanner;
public class LoanApproval_task6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//use logical operator &
		//use nested if-else
		
		//create different data type variable
		System.out.print("Enter age:");
		int age=scan.nextInt();
		
		System.out.print("Enter monthly salary :");
		double monthysalary=scan.nextDouble();
		
		System.out.print("Enter Credit Score here :");
		int creditScore=scan.nextInt();
		
		if(age>=21 && monthysalary>=25000 ) {
			if(creditScore >=700) {
				System.out.print("LOAN APPROVED");
			}
else {		
			}
		}
		else {
			System.out.print("LOAN REJECTED");
		}
	}

}
