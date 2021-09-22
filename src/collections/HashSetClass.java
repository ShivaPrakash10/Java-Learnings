package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetClass {
	
	/* HashSet
	 * 	It implements Set Interface. 
	 *  It is backed by a hash table, (actually a HashMap instance).
	 *  This class permits the null element.
	 * 	Its not synchronized
	 * 	Does not maintain order
	 * 	Declaring HashSet
	  		HashSet set = new HashSet();
			Set set0 = new HashSet();
			HashSet<String> set1 = new HashSet<String>();
			HashSet<String> set2 = new HashSet<String>(12);
			HashSet<String> set3 = new HashSet<String>(set2);
			HashSet<String> set4 = new HashSet<String>(12, 0.75f);
			Set s = Collections.synchronizedSet(new HashSet(...));
	 *	Useful methods in Hashset
	 * 		All the methods declared in Collection and Set interfaces are implemented in this class and along with that we have below methods
	 * 		clone();
	 * 			Since CLone() method returns Objects, we need to cast Object to HashSet
	 * 		 		
	 */

	public static void main(String[] args) {
		
		HashSet <String> cars = new HashSet <String> ();
		
		cars.add("Maruti");
		cars.add("swift");
		cars.add("Audi"); 	
		cars.add("Volvo");
		
		cars.add("swift");
		
		cars.add(null);
		cars.add(null);
		cars.add(null);
		cars.add(null);
		
		System.out.println(cars);
		
		System.out.println("******for loop******");
		for(int i=0;i<cars.size();i++) {
//			System.out.println(cars(i));
		}
		
		System.out.println("******foreach loop******");
		for(String carname : cars) {
			System.out.println(carname);
		}
		
		System.out.println("*********forEach() method");
		cars.forEach(name1 -> System.out.println(name1));
		
		System.out.println("******Iterator******");
		Iterator <String> cars1 = cars.iterator();
		while(cars1.hasNext()) {
			String othercar = cars1.next();
			System.out.println(othercar);
		}
		
		System.out.println("*********clone() method******");
		HashSet <String> clonedcar = (HashSet<String>) cars.clone();
		System.out.println(clonedcar);
		
		
		
		
		
		
		
		
	}

}
