package basics;

public class NestedForLoop {

	int maxCount = 10;
	
	public static void main(String[] args) {
		NestedForLoop NF = new NestedForLoop();
		for(int i=0; i<=NF.maxCount;) {
			System.out.println(i);
			for(int j=0;j<=NF.maxCount;j++) {
				System.out.print(j+",");
//				System.out.println();
//				System.out.println(i);
			}
//			System.out.println(j);
//			System.out.println();
			i = i+2;
			System.out.println();
		}

	}

}
