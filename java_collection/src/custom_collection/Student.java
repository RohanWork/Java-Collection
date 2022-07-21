package custom_collection;

import java.util.Objects;

public class Student implements Comparable<Student>{

	String name;
	int rollNo;
 
	
	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(rollNo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) //If object is same
			return true;
		if (obj == null) 
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollNo == other.rollNo;
	}


	@Override
	public int compareTo(Student that) {
		return this.rollNo-that.rollNo;
	}
	
	
	
}
