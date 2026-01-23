package task_1;

public class Keep_FirstDuplicate_character {

	public static void main(String[] args) {
		String s="programming";
		
		keepFirstDublicate(s);

	}
	
	
	//step 1: create a function to write logic seperatly
	public static void keepFirstDublicate(String str) {
		//logic
		int len=str.length();//length();=return the number of character in string
		
// step 2: create an array to store new string
		char []arr=new char[len];// the array will be of actual length of string-1 if the length is 5 then the array will be of 4.

//step 3: create an count variable to count array element 
		int x=0;

//step 4: boolean variable to handle controll flow of the program
		boolean ispresent=false;
		
//step 5: applying loop outerloop and innerloop
		for(int i=0;i<len;i++) {	//outerloop
			
			for(int j=i+1;j<len;j++) {	//innerloop
//step 6:check for the condition if the character of i and j are same or not
				if(str.charAt(i)!=str.charAt(j)) {
					for(int k=0;k<x;k++) {
						if(arr[k]!=str.charAt(i)) {
							ispresent=false;
							arr[k++]=str.charAt(i);
						}
						
					}
				}
				
					if(str.charAt(i)==str.charAt(j)) {
						for(int k=0;k<x;k++) {
							if(arr[k]!=str.charAt(i)) {
								ispresent=false;
								arr[k++]=str.charAt(i);
							}
							if(arr[k]==str.charAt(i)) {
								ispresent=true;
								break;
							}
						}
					}
					
				
				
			}
		}
		//display
		for(int i=0;i<x;i++) {

			System.out.println(arr[i]);
		}
	}

}
