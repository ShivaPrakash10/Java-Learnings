package basics;

public class ForEachLoop {

	public static void main(String[] args) {
		
		String Vegitables[] = {"Tomato", "Potato", "Onion"};
		
		int numbers[] = {1, 2,3};
		
//		for(Vegitables) {
//			System.out.println(Vegitables);
//		}
		
//		for(bike eachBike: yamaha) {
//			eachBike = yamaha[0];
//			eachBike = yamaha[1];
//			.
//			.
//			eachBike = yamaha[yamaha.length-1]
//		}
			
		
		for(String eachVegitable: Vegitables) {
			System.out.println(eachVegitable);
		}
//		System.out.println(eachVegitables);
		
		for(int i=0; i<Vegitables.length;i++) {
			System.out.println(Vegitables[i]);
		}
		
		for(int each : numbers) {
			System.out.println(each);
		}
		
		//
	}

	
}
