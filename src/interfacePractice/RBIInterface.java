package interfacePractice;

// Interface can have only abstract methods.
// Means we can not implement any methods or put body for an method in interface
// We can declare variables in interface
// We can not create Object for Interface because it only has Abstract methods. Also we can create object only for classes not for interfaces
// Interface can not have constructors.
// If a class wants to inherit the property of an Interface, we need to use "implements" keyword.
// If we want to link a interface with another interface, we need to use "extends" keyword.
// Whenever a class implements an interface, it will force us to implement all the unimplemented methods in our class

// We can not create a static abstract method in an interface
// Interface let us to have methods with body but those methods should be either static or default method
// We can have static method in interface but we cannot use it in any implemented class
// We can access default method in implemented class by using object


/*
 * 1
 * 2
 * 3
 * 4
 */

public interface RBIInterface {
	
	
	public void homeLoan();
	
	public void personalLoan();
	
	public void vehicleLoan();
	
	public void educationLoan();
	
	public int easyLoan();
	
//	public static void loan11();
	
	int a = 5;
	String name = "shiva";
	
	default void marriageLoan1()
	{
	System.out.println("This is a default method in interface");	
	}
	
	public static void marriageLoan2()
	{
		System.out.println("This is a static method in interface");
	}
}
