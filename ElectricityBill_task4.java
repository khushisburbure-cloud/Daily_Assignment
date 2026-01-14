package cotrollStatement;
import java.util.Scanner;
public class ElectricityBill_task4 {

	public static void main(String[] args) {
		//create an object for scanner class
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enterr unit :");
		//declating variable
		int unit=scan.nextInt();
		
		//*logic using nested if-else loop logic 1*//
		
		//if (unit<=100) {
			//System.out.print("LOW USAGE");
		//}
		//	else {
		//	if(unit>100 && unit<301) {
			//	System.out.print("MEDIUM USAGE");
		//}
		//else {
		//System.out.print("HIGH USAGE");
		//}
		//*	}*//
		
		//logic 2 
		if(unit>100) {
			if(unit>100 && unit<301) {
				System.out.print("MEDIUM USAGE");
			}
			else {
				System.out.print("HIGH USAGE");
			}
		}
		else {
			System.out.print("LOW USAGE");
		}

		scan.close();
	}

}
