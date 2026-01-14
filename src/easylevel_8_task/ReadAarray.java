package easylevel_8_task;

public class ReadAarray {

	public static void main(String[] args) {
		//print all element in one line 
		//wring a java code to read N integer elements into an array and print them
		//creating scanner class object
		int elements[]=new int[10] ;
		elements[0]=1;
		elements[1]=2;
		elements[2]=3;
		elements[3]=4;
		//using for loop printing array valaue in sequence order
		
		//2nd logic
		//for(int j=1;j<elements.length;j++) {
			//elements[j]=j;
		//}
		
		System.out.print("Elements of array are: ");
		//logic for array
		for( int i=0;i<elements.length;i++) {
			System.out.print( elements[i] +" ");
		}
		//in logic 2 if the i & j valaue are initialy set to be 1,then only 1 2 3 4 5 6 7 8 9 only 9index get the value what about 10th index
		//sir can we say that in this code that at 9th index hole is generate cause only 9int values is according to the second logic

		
		
		
		

	}

}
