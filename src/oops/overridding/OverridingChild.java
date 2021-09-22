package oops.overridding;

public class OverridingChild extends OverridingParent{

	public void get(int b) {
		System.out.println("Iam a int method in child class");
	}
	
	public void get(String a) {
		System.out.println("Iam a String method in child class");
	}
	
	public void buy(int b,String a) {
		System.out.println("Iam a int,String method in child Class");
	}
	
	public void sell() {
		System.out.println("Iam a method without parameter in child Class");
	}
	
	public void need(int a) {
		System.out.println("need method in child CLass");
	}
	
	public static void main(String[] args) {
//		OverridingChild c1 = new OverridingChild();
		
		OverridingParent c1 = new OverridingChild();
		c1.get(5);
		c1.get(null);
		c1.get("Shiva");
		c1.buy(10, "Tamil");
		c1.sell();
//		c1.need(10);
		c1.borrow(15);
		OverridingChild c2 = new OverridingChild();
	}

}
