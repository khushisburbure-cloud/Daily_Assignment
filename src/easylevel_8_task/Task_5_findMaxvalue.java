package easylevel_8_task;

public class Task_5_findMaxvalue {

	public static void main(String[] args) {
		//creating array
		int b[]= {1,2,3,4,5};
		
		//logic
		int max = b[0];
		for(int i=0; i<b.length;i++) {
			if(b[i]>max) {
				max=b[i];
				
			}
		}
System.out.print("Largest element in array is =" + max);
	}

}
