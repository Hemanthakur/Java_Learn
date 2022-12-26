import java.util.*;
public class Search {
	Node head;
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}
    boolean isEmplty(){
    	return head==null;
    }
    void add(int data) {
    	Node add=new Node(data);
    	add.next=head;
    	head=add;
    }
	public boolean searchitem(Node head,int x) {
		Node temp=head;
		while(temp!=null) {
		if(temp.data==x)
			return true;
			temp=temp.next;
	}
		return false;
	}
	/*Recursive
	 * public boolean search(Node head,int x)
	 * {
	 * if(head=null)
	 * return false;
	 * if(head.data==x)
	 * return true;
	 * return search(head.next,x);
	 */
	 public int GetNth(int index) 
	    { 
	        Node current = head; 
	        int count = 0; /* index of Node we are 
	                          currently looking at */
	        while (current != null) 
	        { 
	            if (count == index) 
	                return current.data; 
	            count++; 
	            current = current.next; 
	        } 
	  
	        /* if we get to this line, the caller was asking 
	        for a non-existent element so we assert fail */
	        assert(false); 
	        return 0; 
	    } 
	
	public static void main(String[] args) {
		Search sc=new Search();
		sc.add(1);
		sc.add(2);
		sc.add(3);
		sc.add(4);
		sc.add(5);
	   if( sc.searchitem(sc.head,1))
		   System.out.println("Yes");
	   else {
		   System.out.println("No");
	   }
	System.out.println(sc.GetNth(0));
	}

}
