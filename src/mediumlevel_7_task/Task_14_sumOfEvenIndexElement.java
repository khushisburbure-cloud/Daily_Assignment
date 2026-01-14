package mediumlevel_7_task;

public class Task_14_sumOfEvenIndexElement {

	public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int sum=0;
	 for(int i=0;i<a.length;i++) {
		 if(i%2==0) {
			 sum += a[i];
		 }
	 }
	
System.out.print("Sum of Even element is :"+sum);
	}

}
