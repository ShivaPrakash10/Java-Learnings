package abstarctPractice;

public class DemoAbstract extends AbstractDemo{

	public void method() {
		System.out.println("this is method1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		AbstractDemo a1 = new DemoAbstract();
		DemoAbstract a1 = new DemoAbstract();
		a1.marriageLoan();
		a1.method();
		method1();
		a1.personalLoan();
		
//		AbstractDemo a2 = new AbstractDemo();
// We cannot create object for Abstract class
		

	}
	@Override
	public void personalLoan() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void landLoan() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void farmingLoan() {
		// TODO Auto-generated method stub
		
	}
	

}
