package array;
import java.util.Scanner;
public class SecondLargestDistinctElemet {

	//not giving correct solution
	
	public static void main(String[] args) {
		//scanner class object create
		Scanner scan=new Scanner(System.in);
		
		//create array of n number
		int arr[]=new int[6];
		
		System.out.print("Enter elements : ");
		//iterrate and set element
		for(int i=0;i<arr.length;i++) {
		//use scanner class object to take input from user and stores the vlaue in array
		arr[i]=scan.nextInt();
		
		//step 4: assume index 0 has largest element in the array
		int max=arr[0];
		
		//if else-if flow 
		//start 1 if part
		for(int j=0;j<arr.length;j++) {
		if(max>arr[i]) {
			max=max;//to find largest among
			
			//consider index 1 to be second largest
			int second=arr[1];
			if(second>arr[i]&&second<max) {
				second=second;
				
			}
			else if(second<arr[i]&&second<max) {
				second=arr[i];
				
			}
			
			System.out.print("Second largest element is :"+second);
		}
		
		
		//else part
		else if(max<arr[i]) {
			max=arr[i];//to find largest among
			//if the largest element found on other index rather than index 0
			
			//now consider index 0 element to be second largest 
			int secondlarge=arr[0];
			
			//if the element found large 
			if(secondlarge>arr[i]&&secondlarge<max) {
				secondlarge=secondlarge;
				
			}
			else if(secondlarge<arr[i]&&secondlarge<max){
				secondlarge=arr[i];
				
			}
			System.out.print("Second largest element is :"+secondlarge);
		}
		
		}
		}//for loop breasts
		
	}

}
