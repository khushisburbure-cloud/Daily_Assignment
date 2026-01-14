package mediumlevel_7_task;
import java.util.Scanner;
public class Task_9_countPositiveNumber {
	
	public static void main(String[] args) {
		Scanner read=new  Scanner(System.in);
		
		System.out.println("Enter elemets in array = ");
		int a[]=new int[5];
		
		
	//local variable creating to count 1
		int counte=0;
		
		//for loop implimentation
		for(int i=0;i<a.length;i++) {
			int num=read.nextInt();
			if(num>0) {
				counte++;
				
				
			}
			
			
		
		}
		
		System.out.print("counte of positive number are ="+counte);
		
		
	}

}
