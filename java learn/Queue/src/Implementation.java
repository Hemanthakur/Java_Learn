import java.util.*;
public class Implementation {
   Node Front;
   Node Rear;
   static class Node{
	   int data;
	   Node next;
	public Node(int data){
      this.data=data;
        next=null;
	}
 }
    
public void enqueue(int data) {
Node temp=new Node(data);	
if(this.Rear==null) {
	this.Rear=this.Front=temp;	
	}
	this.Rear.next=temp;
	this.Rear=temp;
}
public int dequeue() {
	if(Front==null) {
     System.out.println("null");
	}
	int result=Front.data;
	 Front=Front.next;
	 if(Front==null) {
			Rear=null;
		}
	 return result;
}
void print() {
	Node temp=Front;
	while(temp!=null) {
		System.out.print(temp.data+" ");
		temp=temp.next;
		}
}
public static void main(String[]args) {
Implementation im=new Implementation();	
im.enqueue(5);
im.enqueue(4);
im.enqueue(6);
im.enqueue(1);
im.print();
System.out.println();
System.out.println("Front:"+im.Front.data);
System.out.println("Rear:"+im.Rear.data);
System.out.println(im.dequeue()+" dequeue");
System.out.println(im.dequeue()+" dequeue");
System.out.println(im.dequeue()+" dequeue");
im.enqueue(3);
System.out.println(im.dequeue()+" dequeue");
}
}
