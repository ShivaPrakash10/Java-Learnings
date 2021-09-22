package interfacePractice;

public class DemoInterface implements RBIInterface {
	
	public static void marriageLoan()
	{
		System.out.println("This is static method in Demo class");
	}

	public static void main(String[] args) {
//		marriageLoan1();
		DemoInterface d = new DemoInterface();
		d.marriageLoan1();
		
//		marriageLoan2();
	}

	@Override
	public void homeLoan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void personalLoan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vehicleLoan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void educationLoan() {
		// TODO Auto-generated method stub
		
	}

}
