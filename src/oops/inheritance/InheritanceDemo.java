package oops.inheritance;

class ParentClass {

	int a =10;
	String str = "Sathya";
	static int b = 20;
	static String name = "Shiva";
	
	public void method1() {
		System.out.println("I am a normal method in parent class");
	}
	
	public static void method2() {
		System.out.println("I am a static method in parent class");
		
		ParentClass parent = new ParentClass();
		parent.method1();
		System.out.println(parent.a);
		System.out.println(b);
		
//		ArrayList list;
		
		Throwable t;
		
		Exception e;
	}
}

public class InheritanceDemo extends ParentClass{
	
//	Parent class/ Super class
//	Child class/ Sub class
	
//	Inheritance is the property of using the parent class variables/methods in child class
//	extends and implements are the java keywords, used to achieve inheritance.
//	For Class to Class inheritance - we use extends keyword 
//		1) Ex: Exception class extends Throwable class
//	For Class to interface inheritance - we use implements keyword 
//		1) Ex: Throwable class implements Serializable interface
//	Multiple inheritance in Java 
//		1) is not possible by using Classes alone. So below line wont work
//			a) ClassA extends ClassB, ClassC, etc... 
//		2) is possible by using interfaces alone.
//			a) ClassA implements interface1, interface2, etc..
//		3) is possible by using classes and interface together. In this case, class name should be mentioned at first
//			a) ClassA extends ClassB implements interface1, interface2, interface3
//			b) ClassA implements interface1, interface2 extends ClassB - THIS IS NOT RIGHT ORDER TO WRITE
//	Multilevel inheritance in Java
//		1) is possible 
//			a)classA extends ClassB, ClassB extends ClassC
	
	int c = 30;
	static String string = "123"; 
	
	public void method3() {
		System.out.println("I am normal method from InheritanceDemo class");
	}
	
	public static void method4() {
		System.out.println("I am static method from InheritanceDemo class");
	}
	
	

	public static void main(String[] args) {
//		There are 4 ways in creating object 
//		1. creating object for Parent class by using parent as reference class
//		2. creating object for child class by using child as reference class
//		3. creating object for child class by using parent class as reference
//		4. creating object for parent class by using child as reference is not logical. So we cant create it
		
		InheritanceDemo demo = new InheritanceDemo();
		System.out.println(demo.c);
		demo.method3();
		method4();
		System.out.println(demo.a);
		System.out.println(demo.str);
		demo.method1();
		
		ParentClass pa = new ParentClass();
		pa.method1();
		System.out.println(pa.a);
		System.out.println(ParentClass.b);
		
		ParentClass p1 = new  InheritanceDemo();
		System.out.println(p1.a);
		System.out.println(p1.str);
		p1.method1();
		method2();
		
		Child2.method5();
		
		System.out.println("Main method completed");
		
		
//		We cannot create object for Parent Class by keeping child class as reference.
//		InheritanceDemo d1 = new ParentClass();
	}

}

class Child2 extends InheritanceDemo{
	int childInt = 35;
	static String name2 = "A";
	
	public void method6() {
		System.out.println("I am normal method from child2 class");
	}
	
	public static void method5() {
		System.out.println("I am normal method from child2 class");
		Child2 C2 = new Child2();
		System.out.println(C2.a);
		System.out.println(C2.c);
		System.out.println(C2.childInt);
		C2.method1();
		C2.method3();
		C2.method6();
		ParentClass.method2();
		System.out.println(ParentClass.name);
		System.out.println(InheritanceDemo.string);
		InheritanceDemo.method4();
		System.out.println(name2);
		
	}
}
