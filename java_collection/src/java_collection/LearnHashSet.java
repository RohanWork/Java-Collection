package java_collection;

import java.util.HashSet;
import java.util.Set;

// Note : The order is not defined like acceding or descending or smallest or greatest
//		  It not allows duplicate values
//		  Set generates Hash thats why its in random format and not allow duplicate values
//		  Not much difference in all set variations
public class LearnHashSet {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		// Adding the elements in set using add()
			System.out.println("Adding the elements in set using add()...");
			set.add(10);
			set.add(13);
			set.add(9);
			set.add(12);
			set.add(5);
			set.add(11);
			System.out.println("Set contains : "+set+"\n");
//-------------------------------------------------------------------------------------------------

			
		// Removing the elements using remove(value of set);
			System.out.println("11 number is removed using set.remove(11) : "+set.remove(11));
			System.out.println("Set after operation  : "+set+"\n");
//-------------------------------------------------------------------------------------------------
			
			
		// Finding that particular number is present or not using contains()
			System.out.println("Finding the element present in set using set.contains(9)      : "+set.contains(9));
			System.out.println("Finding the element not-present in set using set.contains(16) : "+set.contains(16)+"\n");
//-------------------------------------------------------------------------------------------------
	
	
		// Checking set is empty or not using isEmpty()
			System.out.println("Checking the set is empty or not using set.isEmpty() : "+set.isEmpty()+"\n");
//-------------------------------------------------------------------------------------------------

			
		// Printing the size of set using size()
			System.out.println("Printing the size of set using set.size() : "+set.size()+"\n");
//-------------------------------------------------------------------------------------------------

	
		// Clearing the set using clear()
			set.clear();
			System.out.println("Clearing the set using set.clear() : \n"+"\t\t............Set cleared............\n");
	}

}
