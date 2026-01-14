package easylevel_8_task;

public class Task_2_sumOfArray {

	public static void main(String[] args) {
		//initializing and declaring an array
		int arr[]= {10,20,30};
		int sum =0;
		//logic for sum the number
		for(int i=0; i<arr.length;i++) {
			sum +=arr[i];
			
		}
		//output
		System.out.print("sum of array element is : "+sum);
	}

}
