package string;

public class StringEquals {
	
//	* When we create a String literals, String object will be stored in SCP portion of Heap memory
//	* When we create a String Instance, String object will be stored directly in Heap memory
//	* Java is always case sensitive
//	* equals() method is based on "Object"
//	* == is based on "references"
	
//	1) Compare within String Literals with same object but different reference variables
//	String s1 = "shiva";
//	String s2 = "shiva";
//	System.out.println(s1.equals(s2)); //true
//	System.out.println(s1==s2); //true
//	
//	2) Compare String Literals with String instance, but the object is same.
//	String s1 = "shiva";
//	String s4 = new String("shiva");
//	System.out.println(s1.equals(s4)); //true
//	System.out.println(s1==s4); //false
//	
//	3) Compare within String Literals with different object and different reference variables.
//	String s1 = "shiva";
//	String s3 = "Shiva";
//	System.out.println(s1.equals(s3)); //false
//	System.out.println(s1==s3); //false
//	
//	4) Compare within String instances with same object but different reference variables
//	String s4 = new String("shiva");
//	String s6 = new String("shiva");
//	System.out.println(s4.equals(s6)); //true
//	System.out.println(s4==s6); //false, because references are compared here
//	
//	5)Compare with String instance with different object and different reference variables.
//	String s5 = new String("Shiva");
//	String s4 = new String("shiva");
//	System.out.println(s4.equals(s5)); //false
//	System.out.println(s4==s5); //false

	public static void main(String[] args) {
		String s1 = "shiva";
		String s2 = "shiva";
		String s3 = "Shiva";
		String s5 = new String("Shiva");
		String s4 = new String("shiva");
		String s6 = new String("shiva");
		
		StringEquals obj = new StringEquals();
		String string = new String();
		
		
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals(s3)); //false
		System.out.println(s1.equals(s4)); //true
		System.out.println(s4.equals(s5)); //false
		System.out.println(s4.equals(s6)); //true
		
		System.out.println(s1==s2); //true
		System.out.println(s1==s3); //false
		System.out.println(s1==s4); //false
		System.out.println(s4==s5); //false
		System.out.println(s4==s6); //false
		
		
		
	}

}
