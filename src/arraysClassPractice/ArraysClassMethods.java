package arraysClassPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysClassMethods {
	
//	* We can not directly sysout array. For that, we need to use either Arrays class or for loops
//	* Arrays is a pre-defined class in Java.
//	* It contains many static methods to manipulate and access array elements
	
//	* useful method in Arrays class of Java
//		1) sort()
//		2) parallelSort()
//		3) binarySearch()
//		4) equals()
//		5) fill()
//		6) copyOf()
//		7) copyOfRange()
//		8) asList()
//		9) toString()
//		10) deepToString()
//		11) compare() - compares two arrays.
//	     		It returns the value: 
//	     		  *	0 - if arr1[] and arr2[] are equal
//	     		  *	-1 - if arr1[] < arr2[]
//	     		  *	1 - if arr1[] > arr2[]
//		12) compareUnsigned()
//			* similar to compare() method, but treating the values as unsigned(if value =-5, then it will not consider the sign(-).
//		13) mismatch()
//				* This method returns the first mismatch element index of an array. 
//				* It is used to check whether two arrays contain similar elements or not and, inform when a mismatch occurs.
//				* If both arrays are same then it will return -1.

	public static void main(String[] args) {
		
//		getArrayInputFromUser();
//		printArrayUsingArraysClass(getArrayInputFromUser());
//		sortArrayUsingArraysClass(getArrayInputFromUser());
		
//		int s1[] = getArrayInputFromUser();
//        printArrayUsingArraysClass(s1);
//        sortArrayUsingArraysClass(s1);
//        reverseArray(s1);
		
//		binarySearchUsingArraysClass(getArrayInputFromUser());
		
//		fillMethodInArraysClass(getArrayInputFromUser());
//		
//		copyOfMethodInArraysClass(getArrayInputFromUser());
//		
//		copyOfRangeMethodInArraysClass(getArrayInputFromUser());
//		
		deepToString();
		
//		equalsMethodUsingArraysClass(getArrayInputFromUser(), getArrayInputFromUser());
//		int brr1[] = getArrayInputFromUser();
//		int brr2[] = getArrayInputFromUser();
//		equalsMethodUsingArraysClass(brr1, brr2);
		
//      sortArrayUsingArraysClass(printArrayUsingArraysClass(getArrayInputFromUser()));
		
//		fillMethodInArraysClassWithEmptyArray();
	}
	
	public static int[] getArrayInputFromUser() {
		System.out.println("Enter the size of the array ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("Enter the array elements ");
		int arr[] = new int[a];
		for(int i=0;i<a;i++) {
			arr[i] = scanner.nextInt();
		}
		return arr;
	}
	
	public static void printArrayUsingArraysClass(int arr1[])	{
		System.out.println(Arrays.toString(arr1));
	}
	
	public static void sortArrayUsingArraysClass(int arr2[]) {
		Arrays.sort(arr2);
		printArrayUsingArraysClass(arr2);
	}
	
	public static void reverseArray(int arr3[]) {
		for(int i=arr3.length-1;i>=0;i--) {
			System.out.println(arr3[i]);
//			printArrayUsingArraysClass(arr3);
		}
	}
	
//	* This uses binary search algorithm
//	* used to find the array elements and it returns the index value
//	* First the array should be sorted before searching. If it is not sorted, the results are undefined.
//	* This method returns index of the search key, if it is contained in the array, else it returns (-(insertion point) - 1). 
//	* The insertion point is the point at which the key would be inserted into the array:
	public static void binarySearchUsingArraysClass(int arr6[]) {
		sortArrayUsingArraysClass(arr6);
//		System.out.println(Arrays.toString(arr6));
		System.out.println("Enter the element to find in the array : ");
		Scanner scanner = new Scanner(System.in);
		int b = scanner.nextInt();
		System.out.println(Arrays.binarySearch(arr6, b));
	}
	
	public static void equalsMethodUsingArraysClass(int ar1[] , int ar2[]) {
//		int ar1[] = getArrayInputFromUser();
//		int ar2[] = getArrayInputFromUser();
		System.out.println(Arrays.equals(ar1, ar2));
	}
	
//	* This method assigns the specified data type value to each element of the specified range of the specified array.
	public static void fillMethodInArraysClass(int arr7[]) {
		printArrayUsingArraysClass(arr7);
		Arrays.fill(arr7, 10);
		System.out.println(Arrays.toString(arr7));
	}
	
	public static void fillMethodInArraysClassWithEmptyArray() {
		int arr11[] = new int[4];
		Arrays.fill(arr11, 4);
		System.out.println(Arrays.toString(arr11));
	}
	
//	* This method copies the specified array, truncating or padding with zeros (if necessary) so the copy has the specified length.
//	* For all indices that are valid in both the original array and the copy, the two arrays will contain identical values.
//	* For any indices that are valid in the copy but not the original, the copy will contain 0.
//	* Such indices will exist if and only if the specified length is greater than that of the original array.
	public static void copyOfMethodInArraysClass(int arr8[]) {
		int arr9[] = Arrays.copyOf(arr8, 7);
		printArrayUsingArraysClass(arr9);
	}
	
	public static void copyOfRangeMethodInArraysClass(int arr10[]) {
		int arr11[] = Arrays.copyOfRange(arr10, 2, 8);
		printArrayUsingArraysClass(arr11);
	}
	
//	* deepToString() - For printing MultiDimensional array
	public static void deepToString() {
		int array[][] = { {1, 3, 6}, {3, 1}, {3, 5, 4, 1} } ;
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.deepToString(array));
	}
}
