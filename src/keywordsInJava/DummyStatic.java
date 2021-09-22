/**
 * 
 */
package keywordsInJava;

public class DummyStatic {
	static int x = 9;
	static int y;
	public void method1() {
		System.out.println(x);
//		System.out.println(a);
		System.out.println(y);
		System.out.println("I am method1");
	}
	
	public void method2() {
//		static int a = 10;
		y = 10;
//		method1();
		this.method1();
		System.out.println("I am method2");
	}
	
	public static void method3() {
//		static int a =10;
		System.out.println("I am static method3");
	}
	
	public static void method4() {
//		this.method3();
		method3();
		System.out.println("I am static method4");
	}
	
	public static void main(String[] args) {
		DummyStatic D = new DummyStatic();
		D.method2();
	}

}
