package keywordsInJava;

public class Static {
//	* static is a keyword in java
//	* It can be used with both methods and variables
//	* static variables and methods are belongs to class
//	* static will be stored in heap memory
//	* This means, we don't need to create Object of an class to access static methods and variables inside a class
//	* In order to use the static variables and methods outside of a class, we need to access it using it's respective Class Name
//	* If we keep all the methods and variables of an class as static, that class is called tightly encapsulated class
//	* we can overload a static method but we can not override a static method
//	* we can not declare static variable inside a static or non static method 
//		* because scope of variable declared inside a method ends once method get executed. (method behavior)
//		* static means, it belongs to the class, mean it can be accessed by any methods of the class or other class (static behavior)
//		* Since method and static having exactly opposite behavior, we cant use static inside any method
	
//	* static keyword is used in block too.
//	* static block runs even before main method
//	* static block used to set value to a static variable even before main method
//	* value set to the static variable by static block, wont change through out the execution of class, unless we change it explicitly
//	* we can not use static keyword inside a static block;
	
	
	int rollNo ;
	String name ;
//	String HM = "Muthu";
//	static String HM = "Muthu";
//	String HM;
	static String HM ;
	
	static {
		HM ="Muthu";
	}
	
	public Static() {
		rollNo = 99;
		name = "XXXXX";
//		HM = "Muthu";
//		HM = "YYYYYY";
	}
	
	public Static(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	/*
	public Static(int rollNo, String name, String HeadMaster) {
		this.rollNo = rollNo;
		this.name = name;
//		this.HM = HeadMaster;
//		But this is implicit here
		HM = HeadMaster; 
	}
	*/
	
	public void show() {
		System.out.println(rollNo+" : "+name+" : "+HM);
	}
	
	public static void main(String[] args) {
		Static stu1 = new Static();
		stu1.name = "Sathya";
		stu1.rollNo = 1;
//		HM = "Muthu";
//		stu1.HM = "Muthu";
		
		
		Static stu2 = new Static();
		stu2.name = "Shiva";
		stu2.rollNo = 2;
//		HM = "Muthu";
//		stu2.HM = "Muthu";
		
		stu1.show();
		stu2.show();
		
	}

}
