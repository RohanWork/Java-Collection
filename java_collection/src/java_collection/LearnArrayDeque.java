package java_collection;

import java.util.ArrayDeque;

public class LearnArrayDeque {

	public static void main(String[] args) {
		
		// Translation is अरेडेक
		// Similar methods as queue
		// Adding and removing elements from both sides
		
		// Creating the arraydeque
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		
		// Adding the elements in ArrayDeque by following methods
		System.out.println("Adding elements to the queue...");
			// 1.Offer(): Using this elements added at last
				adq.offer(10);
				adq.offer(12);
				adq.offer(13);
				adq.offer(9);
				adq.offer(11);
				adq.offer(16);
				System.out.println("Elements added by default order : "+adq);
				
			// 2.offerFirst(): Using this elements added at beginning
				adq.offerFirst(15);
				adq.offerFirst(2);
				System.out.println("Elements added at beginning     : "+adq);
				
			// 3.offerLast(): Using this elements added at the end of queue
				adq.offerLast(5);
				adq.offerLast(62);
			    System.out.println("Elements added at last          : "+adq+"\n");
//-------------------------------------------------------------------------------------------------
				
				
		// Removing an elements from an array
			
			// 1.poll(): Using this we can remove first element
				System.out.println("Removing element from queue using poll()            : "+adq.poll());
				
			// 2.pollFirst(): Using this we can remove first element from queue
				System.out.println("Removing first element from queue using pollFirst() : "+adq.pollFirst());
	
			// 3.pollLast(): Using this we can remove last element from queue
				System.out.println("Removing last element from queue using pollLast()   : "+adq.pollLast());
				
				System.out.println("After operation queue contains: "+adq+"\n");
//-------------------------------------------------------------------------------------------------
				
				
		// Finding the first, next, and last element from queue
			// 1.peek(); Using this we can find the next element from queue
				System.out.println("Finding the element from queue using peek()        : "+adq.peek());
				
			// 2.peekFirst(): Using this we can find first element from queue
				System.out.println("Finding first element from queue using peekFirst() : "+adq.peekFirst());
				
			// 3.peekLast(): Using this we can find last element from queue
				System.out.println("Finding last element from queue using peekLast()   : "+adq.peekLast()+"\n");
				
				System.out.println("After operation queue contains: "+adq+"\n");
	}

}
