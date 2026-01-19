package array;
import java.util.Scanner;
public class FindingMatchingNumber {

	public static void main(String[] args) {
		//step 1: create scanner class object
		Scanner scan=new  Scanner(System.in);
		
		//step 2: creating an array with fixed size
		int a[]=new int [5];
		
		System.out.print("Elements of the array is : ");
		
		//step 3: iterating the array 
		//to store and take input from user
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		System.out.print(a[i]);
		}
		
		//finding weither element found or not
		System.out.print("Enter value:");
			int x=scan.nextInt(); //variable created to access from user
			
			boolean found=false;//boolean data type is use
			for(int i=0; i<a.length;i++) {//accessing elemts from array
				if(a[i]==x) {
					found=true;
				}
				if(found) {
					System.out.print( "found1");
				}
				else { 
					System.out.print("Not Found" );
				}
			}
	}

}
