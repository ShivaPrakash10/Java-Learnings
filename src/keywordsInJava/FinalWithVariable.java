package keywordsInJava;

//* final is a keyword in java
//* final can be used with variable, method and class
//* final can not be used with interface. There is no point in using final with interface
//* If we declare a variable as final, the value of the variable can not be changed ANYWHERE
//* final can be used with static and string too
//* If a method is declared as final, then we can not override it
//* If a method is declared as final, then we can overload it
//* if we use final keyword with a class, no class can inherit(extend) it
//* Variable can be declared as final in both static and non static methods


public class FinalWithVariable {
//	(should be used to buy something in shop)
//	final int money=10;
	int money=10;
	final double b = 100;
	final String str = "Sathya";
	final static int c = 11;
	
	public void money() {
		System.out.println("money inital value : "+money);
	}
	
	public void buySomethingInShop() {
		
//		In shop you buy thing which cost more than 10 rupees. 
		money = 20;
//		Here we need to restrict the person only to use the exact money
//		This can be achieved by final keyword
		System.out.println("money value from method1 :"+money);
	}
	
	public static void main(String[] args) {
		FinalWithVariable f = new FinalWithVariable();
		f.money();
//		Again you buy something which is less than 10 rupees
		f.money= 5;
		System.out.println("money value from main :"+f.money);
		f.buySomethingInShop();
		f.money();
	}
	
}
