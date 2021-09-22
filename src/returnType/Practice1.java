package returnType;

//* Whenever we use a return type, store the value in a variable and use that variable wherever we want to use the method.

import java.io.IOException;

public class Practice1 {
	int amount = 10;
	int b;
	
	public int buyThing() {
//	public void buyThing() {
//		int b = amount-5;
		b = amount-5;
//		System.out.println(b);
		return b;
		
	}
	
	public void dummyMethod() {
		b = 12;
		System.out.println(b);
	}
	
	/*
	public static Object method1() {
		Practice1 p1 = new Practice1();
		return p1;
	}
	*/
	
	public String things() {
//		String str = "sathya";
//		return str;
//		return null;
		return "Abc";
		
	}
	
	public void buySomethingElse() {
//		int c = b-2;
		int c = buyThing()-2;
		System.out.println(c);
//		System.out.println(dummyMethod());
		System.out.println(things());
//		System.out.println("null");
	}
	public static void main(String[] args) {
        Practice1 p = new Practice1();
//        p.buyThing();
        p.dummyMethod();
        p.buySomethingElse();
        
		
	}

}
