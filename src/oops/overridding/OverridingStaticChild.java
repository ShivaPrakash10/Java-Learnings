package oops.overridding;

public class OverridingStaticChild extends OverridingStaticParent{
	
//	* We cannot override a static method because, overriding is based on object creation,
//	* since, static belongs to class, we dont create object for it. So overriding is not possible 

	public static void get(int b) {
		System.out.println("Iam a int method in child class");
	}
	
	public static void get(String a) {
		System.out.println("Iam a String method in child class");
	}
	
	public static void buy(int b,String a) {
		System.out.println("Iam a int,String method in child Class");
		System.out.println(b+","+a);
	}
	
	public static void sell() {
		System.out.println("Iam a method without parameter in child Class");
	}
	
	public static void need(int a) {
		System.out.println("need method in child CLass");
	}
	
	public static void main(String[] args) {
		get(5);
		OverridingStaticParent.get(5);
		get("Rice");
		get(null);
		buy(10,"Wheat");
		buy(19,"Dhal");
		sell();
		need(11);
		borrow(15);
		
	}

}
