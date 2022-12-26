import java.util.*;
public class Doublylist {
    Node head;
    Node tail;
	static class Node{
	  Node next,prev;
	  int data;
	  public Node(int data) {
		  this.data=data;
	      next=null;
	      prev=null;
	  }
  }
	boolean isEmpty() {
		return head==null;
	}
	public void insert(int data){
		Node add=new Node(data);
		if(isEmpty()) {
			tail=add;
		}
		else {
			head.prev=add;
		}
		add.next=head;
		head=add;
		
	}
	public void insertend(int data) {
		Node add=new Node(data);
		if(isEmpty()) {
			tail=add;
		}
		else {
			tail.next=add;
		}
		add.prev=tail;
		tail=add;
	}
	 public void printf() {
		 if(head==null) {
			 return;
		 }
		 Node temp=head;
		 while(temp!=null) {
			 System.out.print(temp.data+"--->");
            temp=temp.next;
		 }
	 }
	 public void printr() {
		 if(head==null) {
			 return;
		 }
		 Node temp=tail;
		 while(temp!=null) {
			 System.out.print(temp.data+"--->");
            temp=temp.prev;
		 }
	 }
	
	public static void main(String[] args) {
		Doublylist dl=new Doublylist();
       dl.insert(4);
       dl.insert(3);
       dl.insert(2);
       dl.insert(1);
       dl.insertend(5);
       dl.printf();
       System.out.println();
       dl.printr();
	}

}
