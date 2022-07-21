package java_collection;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {

	public static void main(String[] args) {
		
		//Creating a queue
		Queue<Integer> rollnum = new LinkedList<>();
		
		//Adding the elements in queue
		// Note : For offer() their is add() alternative
		//		  but it throws exception if element is not added 
		//		  and crashes the application.
		System.out.println("Adding the elements in queue using offer()");
		rollnum.offer(10);
		rollnum.offer(13);
		rollnum.offer(9);
		rollnum.offer(12);
		rollnum.offer(5);
		rollnum.offer(15);
		System.out.println("Queue after added elements : "+rollnum+"\n");
		
		
		//Removing the element from queue
		// Note : For poll() their is remove() alternative
		//		  but it throws exception if queue is empty 
		//		  and crashes the application.
		System.out.println("Removed element from queue using poll() : "+rollnum.poll()+"\n");
		
		
		//Finding the next element from queue
		// Note : For peek() their is element() alternative
		//		  but it throws exception if queue is empty 
		//		  and crashes the application.
		System.out.println("Finding the next element from queue using peek() : "+rollnum.peek()+"\n");
	}
}
//
//Removing element <-- |	|	 |	 |   | <-- Adding element
//				    	 ^ 		   ^
//					     |		   |
//					   front      rear
