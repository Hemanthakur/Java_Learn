import java.util.*;
public class Deletion {
   Node head;
	static class Node{
	   int data;
	   Node next;
	   public Node(int data){
		   this.data=data;next=null; }
	}
	boolean isEmpty() {
		return head==null;
		}
	
	public void adding(int data) {
		   Node ins=new Node(data);
		ins.next=head;
		   head=ins;
	   }
	void deletion(int key) {
		Node temp=head,prev=null;
		if(temp!=null && temp.data==key) {
			head=temp.next;
			return;
		}
		while(temp!=null && temp.data!=key) {
			prev=temp;
			temp=temp.next;
		}
			 if (temp == null) return; 
		  prev.next = temp.next; 
	}
	   void print() {
		   Node temp=head;
		   int n=0;//Length of linked list
			while(temp!=null) {
				System.out.print(temp.data+" ");
				n++;//Length of linked list
				temp=temp.next;
			}
			System.out.println("\nlength of linked list:"+n);
	   }
	public static void main(String[] args) {
	Deletion del=new Deletion();
	del.adding(4);
	del.adding(2);
	del.adding(6);
	del.adding(8);
	del.print();
	System.out.println("\nAfter deletion");
	del.deletion(2);
	del.print();
	}

}
