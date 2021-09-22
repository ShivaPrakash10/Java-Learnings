package basics;

public class IfElseMultiple {
	static int a =100;

	public static void main(String[] args) {
		if(a==10) {
			System.out.println("a is equal to 10");
		}
		
		else if(a>10){
				System.out.println("a is greater than 10");
		}
		
		else 
			if(a<10) 
				System.out.println("a is less than 10");
		
		else 
			System.out.println("Hi");
		
		
		System.out.println("I am not belongs to any if else");
	}
//	https://www.programiz.com/java-programming/if-else-statement

}
