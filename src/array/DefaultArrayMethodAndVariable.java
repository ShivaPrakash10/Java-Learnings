package array;

public class DefaultArrayMethodAndVariable {

	public static void main(String[] args) {
		char charArr[] = new char[] { 'a', 'b', 'c', 'd' };

		int intArr[] = { 1, 2, 3, 4, 5 };

		String strArr[] = new String[3];
		strArr[0] = "Sathya";
		strArr[1] = "Tamil";
		strArr[2] = "Shiva";
		
		System.out.println(charArr.length);
		System.out.println(intArr.length);
		int strArrayLength = strArr.length;
		System.out.println(strArrayLength);
		
		
		char clonedCharArr[] = charArr.clone();
		int clonedIntArr[] = intArr.clone();
		String clonedStrArr[] = strArr.clone();
		
//		instead of writing code to print charArr, we used the method created in ArrayPrinting class
		ArrayPrinting pr = new ArrayPrinting();
		pr.simpleForLoopForCharArrayPrinting(clonedCharArr);
		
	}

}
