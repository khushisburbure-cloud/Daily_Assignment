package mediumlevel_7_task;
import java.util.Scanner;
public class Task_12_countnumAppears {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//initialized and declairing array
		int a[]= {1,2,3,2,3};
		int count=0;
		
		//taking input from user
		System.out.print("Enter the number you want to know of its counte in array =");
		int num=scan.nextInt();
		//for loop
		for(int i=0; i<a.length;i++) {
			
			if(num==a[i]) {
				count++;
			}
		}
		System.out.print("Number of time it count is ="+" "+count);
	}

}
