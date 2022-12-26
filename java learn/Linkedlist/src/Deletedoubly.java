import java.util.*;
public class Deletedoubly {
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
		public Node deletebegin(){
			if(isEmpty()) {
			throw new NoSuchElementException();
			}
			Node temp=head;
			if(head==tail) {
				tail=null;
			}
			else {
				head.next.prev=null;
			}
		   head=head.next;
		temp.next=null;
		   return head;
		}
		public Node deleteend() {
			if(isEmpty()) {
				throw new NoSuchElementException();
				}
				Node temp =tail;
				if(head==tail) {
					head=null;
				}
				else {
		tail.prev.next=null;
				}
			tail=tail.prev;
			temp.prev=null;
			return tail;
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
		public static void main(String[] args) {
			Deletedoubly dd=new Deletedoubly();
	       dd.insert(4);
	       dd.insert(3);
	       dd.insert(2);
	       dd.insert(1);
	       dd.printf();
	       System.out.println();
		   dd.deletebegin();
		   dd.deletebegin();
		   dd.printf();
		   System.out.println();
		   dd.deleteend();
		   dd.printf();
		}

	}
