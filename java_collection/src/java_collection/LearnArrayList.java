package java_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
	
	public static void main(String args[]) {

	List<String> students = new ArrayList<>();
	
	//Adding the element in a list
	students.add("Rohan");
	students.add("Pratik");
	students.add("Akash");
	students.add("Mayur");
	students.add("Parth");
	students.add("Priyanka");
	students.add("null");
	students.add("null");
	System.out.println("Initial list contains: \n"+students+"\n");
//-----------------------------------------------------------------------
	
	
	//Getting a n element from list
	System.out.println("Printing elements using get() : ");
	System.out.println("\t"+students.get(0));
	System.out.println("\t"+students.get(5)+"\n");
//-----------------------------------------------------------------------
	
	
	//Setting the element to the list
	students.set(6, "Snehal");
	students.set(7, "Baghi");
	System.out.println("Setted the index using set() at 6 and 7 as : "+students.get(6)+", "+students.get(7));
	System.out.println("After setting list contains: \n"+students+"\n");
//-----------------------------------------------------------------------

	
	
	//Used to find the size of object by loop
	int ele=0;
//-----------------------------------------------------------------------	
	
	
	//Finding the element from list
	if(students.contains("Priyanka")) {
		System.out.println("Found the match using contains method...");
	}
	
	for (int m1 = 0; m1 < students.size(); m1++) {
		if(students.get(m1)=="Priyanka") {
			System.out.println("Found the match using for loop..."+"\n");
		}
	}
//-----------------------------------------------------------------------	
	
	
	//Iterating the elements
	for(int m2=0; m2<students.size(); m2++) {
		ele++;
		// //Printing the element
		// System.out.println(students.get(m2));
	}
	System.out.println("Printing the no. of elements using for loop : "+ele);
	ele=0;
	
	
	for (String stud : students) {
		ele++;
		// //Printing the element
		// System.out.println(stud);
	}
	System.out.println("Printing the no. of elements using for each : "+ele);
	ele=0;
	
	
	Iterator<String> iterate = students.iterator();
	while(iterate.hasNext()) {
		ele++;
		// //Printing the element
		// System.out.println(iterate.next());
		iterate.next();
	}
	System.out.println("Printing the no. of elements using iterator : "+ele+"\n");
	ele=0;
//-----------------------------------------------------------------------
	
	
	//Removing element from a list
	students.remove(7); //giving the index
	students.remove(6); //giving the index
	System.out.println("Removed the index 6 and 7 from a list..."+"\n");
		
	//Removing a complete list
		//students.clear();
//-----------------------------------------------------------------------

	
	//After all operation list contains
	System.out.println("After all operations list contains: \n"+students);
	}
}