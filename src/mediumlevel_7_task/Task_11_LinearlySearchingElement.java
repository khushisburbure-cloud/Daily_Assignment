package mediumlevel_7_task;
import java.util.Scanner;
public class Task_11_LinearlySearchingElement {

	public static void main(String[] args) {
		//create a scanner classs object
		Scanner scan = new Scanner(System.in);
		//creating array
		int a[]= {1,2,-3,4,-5};
		
		System.out.print("Entered the value =");
		int val=scan.nextInt();
		//for loop implimentation
		for(int i=0;i<a.length;i++) {
			if(val==a[i]) {
				System.out.print("element Found");
			}
			
		}

	}

}
