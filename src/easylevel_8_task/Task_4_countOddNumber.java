package easylevel_8_task;

public class Task_4_countOddNumber {

	public static void main(String[] args) {
		//creating and initializing array
		int arr[]= {1,2,3,4,5};
		
		int counte = 0;
		//its time to go for logic
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 !=0) {
				counte++;
			}
		}
System.out.print("Number of odd element counter are ="+counte);
	}

}
