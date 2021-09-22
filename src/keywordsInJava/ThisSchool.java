package keywordsInJava;

//* This is used to call instance variables and methods
//* By using constructors, 
//	* We can use this. to differentiate run time variables and instance variables;
//	* Also by using this., we can assign runtime values to instance variables
//	* We can use this(), to call other constructors from any constructors
//	* this() MUST be first statement in constructor calling
//* When we call a non static method from a non static method in a same class, this is used implicitly while calling
//	* calling a  method(), is same as this.method()
//* We dont need to use this, to call a static method from a static method within a class. Because static always belongs to class
//* this can not be used in main method
	

public class ThisSchool {
	
	int rollNo ;
	String name ;
	String bloodGroup;
	
	public ThisSchool() {
		rollNo = 99;
		name = "xxxxx";
	}
	
	public ThisSchool(int rollNo, String bloodGroup) {
		this.rollNo = rollNo;
		this.bloodGroup = bloodGroup;
	}
	
	public ThisSchool(int rollNo, String bloodGroup, String name) {
//		ThisSchool(int rollNo, String bloodGroup);
//		ThisSchool(1,"b+v")
		
//		this.rollNo = rollNo;
//		this.bloodGroup = bloodGroup;
//		int a =10;
		this(rollNo, bloodGroup); 
		
		this.name = name;
		System.out.println("Printing run time variable values = "+rollNo+ " : "+name+ " : "+bloodGroup);
		System.out.println("Assigned my run time variables to corresponding instance variables = "+this.rollNo+ " : "+this.name+ " : "+this.bloodGroup);
	}
	
	public void show() {
		System.out.println(rollNo+" : "+name);
	}
	
	public void bloodDetails() {
//		this.show();
		show();
		System.out.println(rollNo+ " : "+bloodGroup);
	}
	
	public void studentDetails() {
//		System.out.println("222");
		System.out.println("Printing instance variables = "+rollNo+ " : "+name+ " : "+bloodGroup);
	}
	

	
	public static void main(String[] args) {
		
//		Here our work is adding new students;
		ThisSchool stu1 = new ThisSchool();
		stu1.name = "Sathya";
		stu1.rollNo = 1;
		
		ThisSchool stu2 = new ThisSchool();
		stu2.name = "Shiva";
		stu2.rollNo = 2;
		
//		stu1.show();
//		stu2.show();
		
//		Here our work is to get blood group of each student
		
//		ThisSchool stu3 = new ThisSchool(1, "O+ve"); ThisSchool(1,"b+v")
//		stu3.show();
//		stu3.bloodDetails();
		
		ThisSchool stu4 = new ThisSchool(2, "b+ve", "Tamil");
		stu4.studentDetails();
	}

}
