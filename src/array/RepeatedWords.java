package array;

public class RepeatedWords {

	public static void main(String[] args) {
		String a = "Container object container that holds the fixed number of values of a same datatype. In Java, array is a datatype. We declare a array with below values.";

		String arr[] = a.split(" ");
		String b[] = new String[6];
		int temp = 0;
		boolean check ;

		int count;
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			check = true;
			for(int h=0;h<temp;h++) {
				if(b[h].equalsIgnoreCase(arr[i])) {
					check = false;
				}
			}
			
			if(check) {  //similar to if(true==true) or if(false==true), condition will return the boolean value. Ex (10>2 - True), (10>12 - False)
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equalsIgnoreCase(arr[j])) {
					// System.out.println("The word repeated is " + arr[i]);
					count = count + 1;
//					break;
				}
			}
			if (count > 1) {
				b[temp]=arr[i];
				temp=temp+1;
				for (int k = 0; k <count; k++) {
					System.out.println("The word repeated is " + arr[i]);
				}
			}
		}
		}
//		for(String str : b) {
//		System.out.println(str);
//		}

//		int count = 0;
//		for(int i=0;i<a.length();i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					count = count+1;
//				}
//			}
//			System.out.println("The word"+arr[i]+ " is repeated "+ count + "times");
//		}
	}

}
