package oops.overridding;

public class OverridingStaticParent {

	public static void get(int a) {
		System.out.println("Iam a int method in parent Class");
	}
	
	public static void get(String b) {
		System.out.println("Iam a String method in prent Class");
	}
	
	public static void buy(int a,String b) {
		System.out.println("Iam a int,String method in parent Class");
	}
	
	public static void sell() {
		System.out.println("Iam a method without parameter in parent class");
	}
	
	public static void borrow(int z) {
		System.out.println("borrow method in parent Class");
	}
}
