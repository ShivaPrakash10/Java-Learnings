package keywordsInJava;

public class SuperC extends SuperP {
	
	SuperC() {
		System.out.println("child class constructor");
	}
	
	SuperC(int a){

//		super(); 
		super(a);
		System.out.println(a);
		System.out.println("Child class parameterized constructor");
	}

	public static void main(String[] args) {
		
//		SuperC sc = new SuperC();
		System.out.println("bbbb");
		
		SuperC sc1 = new SuperC(10);
	}

}

class SuperP{
	public SuperP() {
		System.out.println("I am parent class constructor");
		System.out.println("aaaa");
	}
	
	SuperP(int a){
		System.out.println(a);
		System.out.println("Parent class parameterized constructor");
	}
	
}
