
public class Dividelist {
	 static Node head,head1,head2;
	static class Node{
	  int data; 
      Node next, prev; 

      Node(int data) { 
          this.data = data; 
          next = prev = null; 
      } 
  } 
	void split() {
		Node slw=head;
		Node fst=head;
		if(head==null) {
			return;
		}
		/* If there are odd nodes in the circular list then 
        fast_ptr->next becomes head and for even nodes  
        fast_ptr->next->next becomes head */
		  while (fst.next != head&&fst.next.next != head) { 
	            fst = fst.next.next; 
	            slw = slw.next; 
	        } 
	        if (fst.next.next == head) { 
	            fst = fst.next; 
	        } 
	        head1 = head; 
	        if (head.next != head) { 
	            head2 = slw.next; 
	        } 
	        fst.next = slw.next; 
	        slw.next = head; 
	}
 void print(Node node) {
	 Node temp=node;
	 if(node!=null) {
		 do {
		 System.out.print(temp.data+" ");
		 temp=temp.next;
		 }
	 while(temp!=node);
	 }
 }
	public static void main(String[] args) {
		Dividelist div=new Dividelist();
		div.head=new Node(1);
		div.head.next=new Node(2);
		div.head.next.next=new Node(3);
		div.head.next.next.next=new Node(4);
		div.head.next.next.next.next=new Node(5);
		div.head.next.next.next.next.next=div.head;
	    div.print(head);
        div.split(); 
        System.out.println();
    System.out.println("First Circular List "); 
    div.print(head1); 
    System.out.println(""); 
    System.out.println("Second Circular List "); 
    div.print(head2); 
}
}