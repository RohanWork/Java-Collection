package java_collection;

import java.util.Comparator;
import java.util.PriorityQueue;

// Note : PriorityQueue implements min heap i.e. the smallest value come first
//		  The PQ implements same methods as Queue for adding, removing and iterating an elements.
//		  Default the priority set on the smallest element i.e. root.
public class LearnPriorityQueue {

	public static void main(String[] args) {
		
		//This is by default min heap
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
// {Important}	//This is max heap PQ using comparator
				//PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		
		//Adding the elements in PQ using offer()
		System.out.println("Adding the elements in PQ using offer() : ");
		pq.offer(10);
		pq.offer(13);
		pq.offer(9);
		System.out.println("PQ after adding elements : "+pq+"\n");
		
		//Removing an element from the PQ
		System.out.println("removing an element using poll() : "+pq.poll()+" (Removed element)"+"\n");
		
		//Finding the next element in PQ
		System.out.println("Finding the next element in PQ using peek() : "+pq.peek()+" (Next element fromPQ)\n");
	}

}
