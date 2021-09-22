package keywordsInJava;

public class ThisChild extends This{
	
	public void method3() {
		System.out.println("I am method 3 from child class");
	}

	public static void main(String[] args) {
		This tt = new ThisChild();
		tt.method3();
	}

}
