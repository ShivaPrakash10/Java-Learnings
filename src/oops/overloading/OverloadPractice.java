package oops.overloading;

public class OverloadPractice {
	
//	* Polymorphism - One thing available in different format is called Polymorphism.
//	* In Java, we can achieve this using 
//		1) Method Overloading
//		2) Method Overriding
	
	public OverloadPractice() {
		
	}
	
	
	
//	order,type,number of parameters
	public void buy(int a, String b) {
	System.out.println("Iam a int and String method");
	}
	
	public void buy(String a, int b) {
		System.out.println("Iam a String and int method");
	}
	
	public void buy(int a, int b, String c) {
		System.out.println("Iam a int,int and String method");
		System.out.println(a+","+b+","+c);
	}
	
	public void buy(int a) {
		System.out.println("Iam an int method");
		System.out.println(a);
	}
	
	public void buy(String a) {
		System.out.println("Iam a String method");
		System.out.println("My String is: "+a);
	}
	
   public void buy() {
	   System.out.println("Iam a method without parameter");
	   	buy(5);
		buy(10,"Shiva");
		buy("Sathya",20);
		buy(6, 7, "Tamil");
		buy("Ram");
//		buy("Shiva","Sathya");
   }
   
//   public static void callingall() {
//	   OverloadPractice p2 = new OverloadPractice();
//		p2.buy();
//		p2.buy(5);
//		p2.buy(10,"Shiva");
//		p2.buy("Sathya",20);
//		p2.buy(6, 7, "Tamil");
//		p2.buy("Ram");
//   }
   
   
	public static void main(String[] args) {
//		OverloadPractice p1 = new OverloadPractice();
//		p1.buy();
//		p1.buy(5);
//		p1.buy(10,"Shiva");
//		p1.buy("Sathya",20);
//		p1.buy(6, 7, "Tamil");
//		p1.buy("Ram");
		
//		callingall();
		
		OverloadPractice p1 = new OverloadPractice();
		p1.buy();
		
	}

}
