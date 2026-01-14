package easylevel_8_task;

public class Task_8_printOddIndexElement {

	public static void main(String[] args) {
		int e[]= {1,2 ,3 ,4, 5};
		
		System.out.print("Odd index Elements from array are = ");
		 for(int i=1;i<e.length;i=i+2) {
			 System.out.print(e[i]+" ");
		 }

	}

}
