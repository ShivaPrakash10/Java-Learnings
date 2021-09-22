package basics;

public class ForLoop {
	
	static int i; static int maxCount = 10;
	

	public static void main(String[] args) {
//		int i;
		for(i=0;i<maxCount-1;) { //i = i+1;
//			continue;
			System.out.println("This is my =2 increament: "+i);
//			break; //exit point. Always used inside a loop. It breaks the loop 
//			System.out.println("Nothing executes in a loop after break");
			i=i+2;
		}
		
		System.out.println("value of I is " +i);
	}

}
