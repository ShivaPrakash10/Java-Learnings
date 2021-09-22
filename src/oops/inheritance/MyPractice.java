package oops.inheritance;

class SuperClass {
	int a =10;
	String str = "Shiva";
	static int b = 20;
	static String name = "Shiva";
	
	public void method1() {
		System.out.println("I am a normal method in Super class");
	}
	
	public static void method2() {
		System.out.println("I am a static method in Super class");
		
		SuperClass p1 = new SuperClass();
		p1.method1();
		System.out.println(p1.a);
		System.out.println(p1.str);
		System.out.println(b);
		System.out.println(name);
		method2();
	}	
}
public class MyPractice extends SuperClass {
	
	int c = 30;
	static String string = "123"; 
	
	public void method3() {
		System.out.println("I am normal method from MyPractice class");
	}
	
	public static void method4() {
		System.out.println("I am static method from MyPractice class");
	}

	public static void main(String[] args) {
		
		MyPractice m1 = new MyPractice();
		System.out.println(m1.c);
		System.out.println(string);
		m1.method3();
		method4();
		m1.method1();
        SuperClass.method2();
        System.out.println(m1.a);
        System.out.println(m1.c);
        
        SuperClass s1 = new MyPractice();
        s1.method1();
        s1.method2();
        
	}

}

