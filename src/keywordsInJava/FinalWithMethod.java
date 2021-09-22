package keywordsInJava;

public class FinalWithMethod extends Parent {
	
	public void method() {
		System.out.println("This is a method in child class");
	}
	
	public void method1() {
		System.out.println("This is a method1 in child class");
	}
	
	public final void method2() {
		System.out.println("this is simple final method");
	}
	
	public final void method2(int a) {
		System.out.println("this is parameterized final method");
	}

	public static void main(String[] args) {
		Parent p1 = new FinalWithMethod();
		p1.method();
		p1.method1();
		
		FinalWithMethod f1 = new FinalWithMethod();
		f1.method();
		f1.method1();
		f1.method2();
		f1.method2(5);
		
		Parent p2 = new Parent();
		p2.method();
		p2.method1();
		
	}

}

class Parent {
	
	public void method() {
		System.out.println("This is a method in parent class");
	}
	
//	final public void method1() {
//	public final void method1() {
	public void method1() {
		System.out.println("This is a method1 in parent class");
	}
	
}
