package mediumlevel_7_task;

public class Task_15_DifferencebetweenMax_Min {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int min=a[0];
		int max=a[0];
		int diff=0;
		for(int i=0; i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
			diff=max-min;
		}
System.out.print("Difference between max and min element in an array is :"+diff);
	}

}
