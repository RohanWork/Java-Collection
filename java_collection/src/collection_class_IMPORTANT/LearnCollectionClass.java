package collection_class_IMPORTANT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(13);
		list.add(15);
		list.add(9);
		list.add(11);
		list.add(2);
		System.out.println("The list contains : "+list+"\n");
		
		// Finding the minimum value from list
			System.out.println("Find min value using Collections.min(list) : "+Collections.min(list)+"\n");
			
		// Finding the minimum value from list
			System.out.println("Find max value using Collections.max(list) : "+Collections.max(list)+"\n");
			
		// Finding the frequency of a number (How much time it occurs)
			System.out.println("Find frequency of a number using Collections.frequency(list, 13) : "+Collections.frequency(list,13)+"\n");
			
		// Sorting the collection
			// Sort as ascending order
			System.out.println("Sorting the collection as ascending using Collections.sort(list) : ");
			Collections.sort(list);
			System.out.print(list+"\n\n");
			
			// sort as descending order
			System.out.println("Sorting the collection as descending using Collections.sort(list) : ");
			Collections.sort(list, Comparator.reverseOrder());
			System.out.print(list+"\n\n");
			
	}

}
