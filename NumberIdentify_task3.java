package cotrollStatement;
import java.util.Scanner;
public class NumberIdentify_task3 {

	public static void main(String[] args) {
		//scanner object creation
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Enter Number :");
		//int type data variable
		int num=scan.nextInt();
		
		//applying loop
		if(num>0) {
			System.out.print("NUNBER IS POSITIVE");
		}
		else if(num<0){
			System.out.print("NUNBER IS NEGATIVE");
		}
		else {
			System.out.print("ZERO");
		}
	}

}
