package keywordsInJava;

//* super is keyword, it can be used with variables(static and non static), methods(static and non static) and constructors
//* super can not be used in main method
//* whenever a child class overrides, variable and method of a parent class and we need to use parent class variable and method,
//	* in child class method, then we use super keyword to call parent class overridden method or variable.

//* All child class constructors have super() method written implicitly.
//* There is no harm in writing super() explicitly in child class constructors.
//* super(); 
//* whenever we call a child class constructor, parent class constructor will be always called because
//	* in child class constructor, super() keyword is implicitly written and it will call the parent class constructor
//* Even child class's parameterized constructor have super() implicitly written.
//* Parameter passed in child class wont be passed to super()
//* If we want our child class's parameterized constructor to call parant method's parameterized constructor,
//	* then we need to pass the parameter to super() by overriding it.

public class Super extends ParentSuper{
	int a = 20;
	String str = "Sathya";
	
	public void method1() {
		System.out.println("I am child class method1");
	}
	
	public void method3() {
		System.out.println(a);
		System.out.println(str);
		System.out.println(super.a);
		System.out.println(super.str);
		System.out.println("I am child class method3");
		method1();
		super.method1();
		method4();
		super.method4();
		ParentSuper.method4();
	}
	
	public static void method4() {
		System.out.println("I am child static method4");
	}
	
	public static void main(String[] args) {
		Super su = new Super();
//		System.out.println(su.a);
//		System.out.println(super.a);
//		System.out.println(su.str);
//		su.method1();
//		super.method1();
		su.method3();
		
//		final int b = 100;
		
	}
}

class ParentSuper {
	int a =10;
	String str = "123";
	static String S = "ab";
	
	public void method1() {
		System.out.println("I am parent class method1");
	}
	
	public void method2() {
		System.out.println("I am parent class method2");
	}
	
	public static void method4() {
		System.out.println("I am parent static method4");
	}
	
//	public static void main(String[] args) {
//		System.out.println("12");
//	}
}
