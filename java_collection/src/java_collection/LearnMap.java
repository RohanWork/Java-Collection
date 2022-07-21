package java_collection;

import java.util.HashMap;
import java.util.Map;

// Note: It stores the elements in <key, value> pair
//		 The key is unique element it cannot be duplicate
//		 If the key is same and value is different then the value is override with new value

public class LearnMap {

	public static void main(String[] args) {
		
		Map<String, Integer> numbers = new HashMap<>();
		
		// Adding the elements in <key, value> pair
			System.out.println("Adding the elements in <key, value> pair");
			numbers.put("One", 1);
			numbers.put("Two", 2);
			numbers.put("Three", 3);
			numbers.put("Four", 4);
			System.out.println("Map after performing operation : \n"+numbers+"\n");
//-------------------------------------------------------------------------------------------------
	

		// Trying to add same key and different value
			System.out.println("Putting same key and different value numbers.put<Two, 5> : "+numbers.put("Two", 5)+"\nOverrides the previous value with new one");
			System.out.println("\nMap after performing operation : \n"+numbers+"\n");
//-------------------------------------------------------------------------------------------------	

			
		// For not overriding the value by same key
			if(!numbers.containsKey("Three")) {
				numbers.put("Three", 9);
			}
			else {
				System.out.println("<Three, 9> : The key is already present, not able to override value.\n");
			}
			// It checks whether the key is present or not
			// if present then value is not changed, if not present
			// then assigned the value to the key i.e. <Three, 9>
			
			// Alternative method is putIfAbsent()
			System.out.println("Putting the values using numbers.putIfAbsent(Four, 8) method : \nKey already present not able to ovveride value"+"\n");
//-------------------------------------------------------------------------------------------------

			
		// Iterating the map 
			// Using for each loop
			for(Map.Entry<String, Integer> iterate : numbers.entrySet()) {
				// Printing the all <key, value> pair
					System.out.println("Printing all <key, value> pair: "+iterate);
					
				// Printing only <key> pairs:
					System.out.println("Printing the only <key> pairs: "+iterate.getKey());
					
				// Printing only <value> pair:
					System.out.println("Printing only <value> pair: "+iterate.getValue()+"\n");
			}
//-------------------------------------------------------------------------------------------------
			
			
		// Removing the key from map using remove
			System.out.println("Removing the <key> using numbers.remove<key:Four>: "+numbers.remove("Four")+"\n");
//-------------------------------------------------------------------------------------------------
			
		System.out.println("After all operation map contains: \n"+numbers+"\n");
	}

}
