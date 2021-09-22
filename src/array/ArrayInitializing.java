package array;

public class ArrayInitializing {
	
//	* Container object that holds the fixed number of values of a same datatype
//	* In Java, array is a data type
//	* We declare array with below values 
//		* int arr[] = new int[5]; 
//			OR int[] arr = new int[5];
//			OR int[] arr = new int[] {1, 2, 3, 4, 5};
//			OR int arr[] = {1, 2, 3, 4, 5};
//		* int - daya type
//		* [] - array
//		* arr - array variable
//		* new - key word in java
//		* 5 - size
	
//	* We can not print an array without initializing it.
//		* int arr[] - we can not sysout it
//		* char arr[] = new char[] {'a', 'b', 'c','d'} - we can sysout it because we initialized it
	
//	* We can not directly sysout array. For that, we need to use either Arrays class or for loops
//		* Arrays is a pre-defined class in Java.
//		* It contains many static methods to manipulate and access array elements
		
//	* user defined array variable provides us, clone method and length variable
//		* clone method - helps us to copy an array
//		* length variable is used to get the size of the array
	
	public static void main(String[] args) {
		
		int arr[];
//		System.out.println(arr); //No complie time error
		
		int arr2[] = new int[10];
		System.out.println(arr2);
		
//		We can declare array using any of the below format
		
		char charArr[] = new char[] {'a', 'b', 'c','d'};
		
		
		int intArr[] = {1, 2, 3, 4, 5};
		
		String strArr[] = new String[3];
		strArr[0] = "Sathya";
		strArr[1] = "Tamil";
		strArr[2] = "Shiva";
		
		System.out.println(charArr);
		System.out.println(intArr);
		System.out.println(strArr);
		
		System.out.println(charArr[0]);
		System.out.println(intArr[4]);
//		System.out.println(strArr[4]);
		System.out.println(intArr[-1]);
		
	}

}
