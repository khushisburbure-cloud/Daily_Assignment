package array;
import java.util.Scanner;
public class DifferenceBetweenElement {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int arr[]= {55,46,78,88,20,1,22,32,75};
		
		System.out.print("Deference between elements of array is :");
		for(int i=0;i<arr.length;i++) {
			//considerr min and max vlaue at index 0
			int max=arr[0];
			int min=arr[0];
			
			if(max>arr[i]) {
				max=max;
			}
			if(max<arr[0]) {
				max=arr[i];
			}
			if(min<arr[i]) {
				min=min;
			}
			 if(min>arr[i]) {
				min=arr[i];
			}
			int diff=max-min;
			System.out.print(diff);
		}


	}

}
