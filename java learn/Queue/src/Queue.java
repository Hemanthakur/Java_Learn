//Integer Implementation
import java.util.*;
public class Queue {
    int front,rear,size;
    int capacity;
    int arr[];
    public Queue(int capacity) {
    	this.capacity=capacity;
    	front=this.size=0;
    	rear=capacity-1;
     arr=new int[this.capacity];
    }
    boolean isFull(Queue q) {
    	return (q.capacity==q.size);
    }
    boolean isEmpty(Queue q) {
    	return (q.size==0);
    }
  void enqueue(int item) {
	  if(isFull(this))return;
  this.rear=(this.rear+1) % this.capacity;
  this.arr[this.rear]=item;
  this.size=this.size+1;
  System.out.print(item +"  ");
  }
  int dequeue() {
	  if(isEmpty(this))
		  return Integer.MIN_VALUE;
    int item=this.arr[this.front];
    this.front=(this.front+1)%this.capacity;
    this.size=this.size-1;
  return item;
  }
    int front() {
	  if(isEmpty(this))
		  return Integer.MIN_VALUE;
    	return this.arr[this.front];
    }
    int rear() {
  	  if(isEmpty(this))
  		  return Integer.MIN_VALUE;
      	return this.arr[this.rear];
      }
    	public static void main(String[] args) {
	Queue q=new Queue(1000);
	q.enqueue(44);
	q.enqueue(34);
	q.enqueue(43);
	System.out.println();
	System.out.println(q.front());
	System.out.println(q.dequeue()+" removed");
	System.out.println(q.rear());
    	} 
}
