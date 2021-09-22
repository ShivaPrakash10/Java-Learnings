package array;

public class CountWords {

	public static void main(String[] args) {
		String a = "Container object that holds the fixed number of values of a same datatype. In Java, array is a datatype. We declare array with below values.";
	
		String arr[] = a.split(" ");
//		String arr[] = a.split("of");
		
		ArrayPrinting obj = new ArrayPrinting();
		obj.AdvancedForLoopForStringArrayPrinting(arr);
		
		System.out.println("The total number of words are : "+arr.length);
		
		System.out.println(a.replace("of" , "hi"));
//		System.out.println(a.replace('of' , 'hi'));
		
		for( String str : arr) {
			if(str.equalsIgnoreCase("of")) {
				System.out.println("Hi");
			}
			else
				System.out.println(str);
		}
	}

}
