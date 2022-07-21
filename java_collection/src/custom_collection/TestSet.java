package custom_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		
		Set<Student> stud = new HashSet<>();
		
		stud.add(new Student("Rohan", 13));
		stud.add(new Student("Rohan", 9));
		stud.add(new Student("Pratik", 13));
		stud.add(new Student("Akash", 12));
		
		System.out.println("The students are : \n"+stud);
		System.out.println("Removed the 'Pratik' which contains the same rollNo.\n");
		
		
		// Implementing the custom sorting
			List<Student> student = new ArrayList<>();
			
			student.add(new Student("Rohan", 13));
			student.add(new Student("Rohan", 9));
			student.add(new Student("Pratik", 13));
			student.add(new Student("Akash", 12));
			
		// Implementing the custom sorting based on rollNo
			System.out.println("Implementing the custom sorting based on rollNo");
			Collections.sort(student);
			System.out.println(student+"\n");
		
		// Implementing the custom sorting based on name using comparator class
			System.out.println("Implementing the custom sorting based on name");
			Collections.sort(student, (o1, o2)->o1.name.compareTo(o2.name));
			System.out.println(student+"\n");
	}

}
