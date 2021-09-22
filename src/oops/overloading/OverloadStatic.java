package oops.overloading;

public class OverloadStatic {

	
	public static void buy(int a, String b) {
		System.out.println("Iam a int and String method");
		System.out.println(a+","+b);
		}
		
		public static void buy(String a, int b) {
			System.out.println("Iam a String and int method");
			System.out.println(a+","+b);
		}
		
		public static void buy(int a, int b, String c) {
			System.out.println("Iam a int,int and String method");
			System.out.println(a+","+b+","+c);
		}
		
		public static void buy(int a) {
			System.out.println("Iam an int method");
			System.out.println(a);
		}
		
		public static void buy(String a) {
			System.out.println("Iam a String method");
			System.out.println("My String is: "+a);
		}
		
		public static void buy() {
			System.out.println("Iam a method without parameter");
		}
		
	public static void main(String[] args) {
		buy(5);
		buy("Rice");
		buy(10,"Wheat");
		buy("Dhal",7);
		buy(4,8,"Shiva");
		buy();
		
	}

}
