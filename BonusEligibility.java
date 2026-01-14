package cotrollStatement;
import java.util.Scanner;
public class BonusEligibility {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//scanner object
		
		//cteating int data type vatiable
		System.out.println("Enter salary:");
				int salary=scan.nextInt();
				
				
			System.out.print("Enter year of experience:");	
				int experience=scan.nextInt();
				
		
		 
		//logic
		if(salary>=30000 && experience >=3) {
			System.out.print("BONUS ELIGIBLE");
		}
		else {
			System.out.print("NOT ELIGIBLE");
	}
		
		
	}

}
