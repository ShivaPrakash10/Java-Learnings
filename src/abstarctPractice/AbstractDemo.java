package abstarctPractice;

/*
 * Abstract is not an interface its a Class
 * Abstract is also a keyword used along with class and methods
 * Abstract class can have both Abstract method and/or normal(concrete)methods
 * When we create abstract method inside a normal class, that class will be converted to abstract class.
 * It is not mandatory to have an abstract method in an Abstract class
 * We can use variables in Abstract class too
 * When a class wants to inherit the property of an Abstract class, we need to use "extends" keywords.
 * When we extends Abstract class to any class, it will force us to implement all the unimplemented methods in our class
 * We can not create object for an Abstract class
 * We can not have static abstract methods in Abstract class.
 */

public abstract class AbstractDemo {
	int a = 20;
	String sr = "Sathya";

	public void marriageLoan() {
		System.out.println("This is marriage loan");
	}
	
	public static void method1() {
		System.out.println("I am static method in Abstract class");
	}

	public abstract void landLoan();
	
	public abstract void farmingLoan();
	
	public abstract void personalLoan();
	
//	public static abstract void method2();

}
