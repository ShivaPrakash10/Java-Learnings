package oops.overridding;

public class OverridingParent {

	public void get(int a) {
		System.out.println("Iam a int method in parent Class");
	}
	
	public void get(String b) {
		System.out.println("Iam a String method in prent Class");
	}
	
	public void buy(int a,String b) {
		System.out.println("Iam a int,String method in parent Class");
	}
	
	public void sell() {
		System.out.println("Iam a method without parameter in parent class");
	}
	
	public void borrow(int z) {
		System.out.println("borrow method in parent Class");
	}
}
