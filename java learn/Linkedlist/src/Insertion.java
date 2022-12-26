import java.util.Scanner;
public class Insertion {
	Node head;
	static class Node{
    	int data;
    	Node next;
    	public Node(int data) {
    		this.data=data;	next=null;
    	}
	}
	boolean isEmpty() {
		return head==null;}
	
	void inbeg(int data) {
		Node add=new Node(data);
	       add.next=head;
	        head=add;
	}
	void given(Node prev,int data) {
		Node add=new Node(data);
		if(prev==null) {
			System.out.println("Given node cannot be null");
		return;
		}
		add.next=prev.next;
		prev.next=add;
	}
	void inend(int data) {
	Node add=new Node(data);	
	if(isEmpty()) {
		head=add;
		return;
	}
	Node temp=head;
	  while(temp.next!=null) {
		  temp=temp.next;  
	  }
	  temp.next=add;
	}
	void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
   Insertion in=new Insertion();
  in.inbeg(1);
   in.inend(2);
   in.inend(3);
   in.inend(5);
   in.inend(6);
   in.inbeg(0);
   in.given(in.head.next.next.next, 4);
   in.print();
	}


}
