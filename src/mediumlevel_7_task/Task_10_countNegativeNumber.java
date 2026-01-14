package mediumlevel_7_task;
import java.util.Scanner;
public class Task_10_countNegativeNumber {

	public static void main(String[] args) {
		
		//create scanner class object
		Scanner read=new Scanner(System.in);
		
		//creating an array
		System.out.println("Enter element into array =");
				int a[]=new int[5];
		
		//create counter variable
		int counte=0;
		
		
		//logic to count negative number from array
		for(int i=0; i<a.length;i++) {
			//creating local variable to call object of scanner class
			int num=read.nextInt();
			
			if(num<0) {
				counte++;
			}
		
		}
		System.out.print("Negative number counterr in array are ="+counte);
		}
		

	}


