package easylevel_8_task;

public class Task_6_findMinimumElement {

	public static void main(String[] args) {
		//array initialization
		int c[]= {1,2,3,4,5};
		int min=c[0];
		
		//logic
		for(int i=0; i<c.length;i++) {
			//logic 1
			if(c[i]>min) {
				min=min;
			}
			//logic 2
			//if(c[i]<min) {
				//min=c[i];
			//}
		}
System.out.print("Minimum element in the array is ="+min);
	}

}
