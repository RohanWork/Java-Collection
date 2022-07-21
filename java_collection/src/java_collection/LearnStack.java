package java_collection;

import java.util.Stack;

public class LearnStack {

	public static void main(String[] args) {
		
		//Creating the stack
		Stack<String> animals = new Stack<>();
		
		//Pushing the elements in stack
		System.out.println("Entering the elements in stack using push()");
		animals.push("Lion");
		animals.push("Tiger");
		animals.push("Dog");
		animals.push("Horse");
		animals.push("Cat");
		animals.push("Lioness");
		
		System.out.println("The stack contains : \n"+animals+"\n");
		
		//Checking the top element from stack
		System.out.println("The top element from stack using peek()     : "+animals.peek()+"\n");
		
		//Removing the elements from stack
		System.out.println("Removing the element from stack using pop() : "+animals.pop());
	}

}

