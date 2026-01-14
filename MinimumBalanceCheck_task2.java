package cotrollStatement;
import java.util.Scanner;
public class MinimumBalanceCheck_task2 {

	public static void main(String[] args) {
		
		//object creation of scanner class
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter the amount :");
		
		//created a double datatype and geting the input from the user
		double balance=scan.nextDouble();
		
		//logic
		if(balance>=1000) {
			System.out.print("BALANCE OK");
		}
		else {
			System.out.print("LOW BALANCE");
		}
		scan.close();
	}

}
