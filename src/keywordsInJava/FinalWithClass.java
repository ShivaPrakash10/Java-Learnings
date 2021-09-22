package keywordsInJava;

public class FinalWithClass extends Parent1{

	public static void main(String[] args) {
		FinalWithClass f1 = new FinalWithClass();
		f1.method();
	}

}

//final class Parent1 {
class Parent1 {	

	public void method() {
		System.out.println("This is a method in parent class");
	}
	
}