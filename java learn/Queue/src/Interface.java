import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.PriorityBlockingQueue;
public class Interface {

	public static void main(String[] args) {
     
     //linked list using
		Queue<Integer> q=new LinkedList<Integer>();
	  q.add(10);
	  q.add(20);
	  q.add(15);
	  System.out.println(q);
     System.out.println(q.peek());
	 System.out.println(q.poll());
	 System.out.println(q.peek());
	 
		//Priority queue using
	 /*Queue<Integer> pq=new PriorityQueue<Integer>();
	pq.add(10);
	pq.add(20);
	pq.add(30);
	pq.add(54);
	pq.add(25);
	System.out.println(pq);
	System.out.println(pq.peek());
	System.out.println(pq.poll());
	System.out.println(pq.peek());
	System.out.println(pq.poll());
	System.out.println(pq.peek());
	 */
	//PriorityQueueBlockking	
	/*	Queue<Integer> pb= new PriorityBlockingQueue<Integer>();
		pb.offer(10);
		pb.offer(20);
		pb.offer(30);
		pb.offer(54);
		pb.offer(25);		
		System.out.println(pb);
		System.out.println(pb.peek());
		System.out.println(pb.poll());
		System.out.println(pb.element());
		System.out.println(pb.poll());
		System.out.println(pb.element());
	*/}

}
