package primitive_array_class_functions_IMPORTANT;

import java.util.Arrays;

public class LearnArrayClass {

	public static void main(String[] args) {
		
		// Creating array
			int[] num = {1, 4, 6, 7, 9, 2, 8, 3, 5};
		
			
		// Sorting the array
			System.out.println("Sorting the array using Arrays.sort(num): ");
			Arrays.sort(num);
			for(int i:num) {
				System.out.print(i+" ,");
			}
			System.out.println("\n");
		
			
		// Performing binary search on array
			// For binary search we have to need sorted array
			int index = Arrays.binarySearch(num, 3);
			System.out.println("The index of an element 3 in array : "+index+"\n");
	}

}
