package keywordsInJava;

public class This {
	
	int amount;
	
	public void method1(int amount) {
		this.amount = amount;
		System.out.println(this.amount);
		this.method3();
		method3();// This is same as this.method3(). this is hidden here
	}
	
	public void method2(int amount ) {
		this.amount = amount;
		System.out.println(this.amount);
	}
	
	public void method3() {
		System.out.println("I am called method3");
	}
	
	public static void main(String[] args) {
		This t = new This();
		t.method1(10);
		t.method2(345);
	}
	
}

