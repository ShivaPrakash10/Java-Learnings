package exception;

import java.io.IOException;
import java.sql.SQLException;

//* Error - If error happens, execution will stop. Errors should not be handled, it should be fixed.  
//		* Errors can be runtime error, or compile time error.
//		* Complile time error - if we do not follow java coding standards we get compile time error. 
//			* IDE itself let us know the errors while writing
//			* Only after fixing it, we can run the code 
//			* eg: declaring a variable without data type. 
//		* Run time error - It does not captured during compile time. 
//			* eg: trying to run a code without main method
//			* trying to get string value from a numeric cell of an excel 

//* Exception - An exception is an unwanted or unexpected event, which occurs during the execution of a program; 
//* i.e at run time, that disrupts the normal flow of the program’s instructions.
//		* If Exception is not handled, program will not continue.
//		* Exception needs to handled. So that, other line of codes will execute as usual
//		* To handle an exception, we use try and catch blocks
//	* In Java, Exception is a class and its extends Throwable class. 
//	* eg: for exception - ArithmaticException, IOException, SQLException, NullPointerException, FileNotFoundException
//	* All the above exceptions extends to --> RuntimeException class --> Exception class --> Throwable class
//	* Whatever the code causing the error should be present in try block
//	* The exception happens due to the try block code needs to be caught in catch block
//	* A single try block can have multiple catch block
//	* Its always good practice to put exact exception as catch block at first place, then put exception class as a catch in next catch block
//	* If try block get executed and throws an exception, then respective catch block will be executed
//	* If try block get executed and throws an exception but we did not put respective exception catch block, that time parent exception catch block will run
//	* Whether catch block executed or not, finally block will get executed after try block
//	* All the method we use in the catch block are implemented in super parent "Throwable" class
//	* Whenever we create a catch block, we create an object for the respective exception; and by using the object we access the methods	
	
// 	* how to use try, catch and finally block
//	1) we can not use try block alone;
//	2) if we use try alone, we need to completed it with finally block (try, finally)
//	3) try, catch alone
//	4) try, catch, catch, etc... 
//	5) try, catch, finally
//	6) try, catch, catch, etc... finally
//	7) we can not use finally alone


public class ExceptionDemo1 {
	
	public void method1() {
	int a = 10;
	try {
		int b = 10/2;
//		int b = 10/0;
//		String str;
//		System.out.println(str.length());
//		int[] arr = new int[3];
//		System.out.println(arr[4]);
	} 
//	catch(ArithmeticException Ar) {
//		ArithameticException Ar = new ArithmeticException();
//		System.out.println(Ar.getMessage());
//		System.out.println("Do not devide by Zero");
//	}
//	
//	catch(NullPointerException io) {
//		System.out.println(io.getMessage());
//		System.out.println(io.getStackTrace());
//		System.out.println(io.getLocalizedMessage());
//	}
//	
//	catch (Exception e) {
//		System.out.println(e.getMessage());
//		System.out.println("I am parent class of all exception");
//	}
//	
	finally {
		System.out.println("documenting the exception or cause of exception");
	}
	
	
	System.out.println("Hiiii");
	}
	
	public static void main(String[] args) {
		ExceptionDemo1 ec = new ExceptionDemo1();
		ec.method1();
	}

}
