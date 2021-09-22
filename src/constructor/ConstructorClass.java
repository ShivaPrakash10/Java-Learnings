package constructor;

//* Constructor is not a method
//* Constructor name should be as same as Class Name
//* Constructor should not have any return type
//* Constructor can be parameterized or non parameterized
//* Constructor belongs to the class
//* For each class, a default constructor is always there and it is invisible and it dont do any work by default
//* Constructor used to assign values to instance variables, especially when they are private
//* Each class have its own constructor(default constructor) and it is hidden always (means implicitly available)
//* Whenever we create object for a class, after copying non static variables and methods, default constructor will always run;
//		* Since default constructor is implicit and does not have anything in it, we dont see it running
//		* If we explicitly put something in default constructor, while object creation, we can see it running
//* How to call constructor?
//* How to assign a value to a final variable?
//* How to call one constructor from another?
//* Can constructor can be private?

public class ConstructorClass {
	int amount;
	String str = "Sathya";
	
	public void method1() {
		System.out.println("I am normal method");
	}
	
	public ConstructorClass() {
		System.out.println("I am non parameterized constructor");
		amount =10;
	}
	
	ConstructorClass(int a) {
		System.out.println("This my default constructor with int parameter");
		amount = 19;
		str = "abs";
	}
	
	public ConstructorClass(String a) {
		System.out.println("I am String parameterized constructor");
		amount =20;
	}
	
	public ConstructorClass(String a, int b) {
		System.out.println("I am String, int parameterized construcor");
		amount = 23;
	}
	
	public ConstructorClass(int a, String b) {
		System.out.println("I am String, int parameterized construcor");
	}

	public static void main(String[] args) {
		ConstructorClass obj = new ConstructorClass();
		ConstructorClass obj1 = new ConstructorClass(5);
		ConstructorClass obj2 = new ConstructorClass("Sathya");
		System.out.println(obj1.amount);
		System.out.println(obj1.str);
	}

}
