package string;

public class StringLearning2 {

	public static void main(String[] args) {
		String str3 = "Shiva";
		char arr[] = str3.toCharArray(); // {'S'..}
		System.out.println(arr);

		for (char each : arr) {
			System.out.println(each);
		}

		char arr1[] = { 'T', 'a', 'm', 'i', 'l' };
		System.out.println(arr1);

		for (char each : arr1) {
			System.out.println(each);
		}

	}

}
