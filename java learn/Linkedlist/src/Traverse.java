import java.util.*;
public class Traverse {
	Node head;
	void add(int data) {
		Node put=new Node(data);
		if(isEmpty()) {
		head=put;
		return;
		}
	  Node temp=head;
	  while(temp.next!=null) {
		  temp=temp.next;  
	  }
	  temp.next=put;
	}
	boolean isEmpty() {
		return head==null;
	}
	void print() {
		Node temp=head;
		  while(temp!=null) {
			  System.out.print(temp.data+" ");
			  temp=temp.next;  
		  }
	}
	static class Node{
		 int data;
		 Node next;
		 
	public Node(int data){
		  this.data=data;
		  next=null;
		  
	  }
}
public static void main(String[]args) {
	Traverse tv=new Traverse();
	tv.add(2);
	tv.add(4);
	tv.add(1);
	tv.print();
}
}