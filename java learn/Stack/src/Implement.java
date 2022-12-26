import java.util.*;
public class Implement {
       private ListNode top; 
       private class ListNode{
    	   int data;
    	   ListNode next;
            public ListNode(int data) {
            	this.data=data;
            }
       }
       public Implement() {
    	   top=null;
       }
       public boolean isEmpty() {
    	   return top==null;
       }
       public void push(int data) {
    ListNode temp=new ListNode(data);
    if(temp==null) {
    	System.out.print("overflow");
            return;
    }
        temp.next=top;
    	   top=temp;
       } 
       
       public int pop() {
	 if(isEmpty()) {
		 throw new EmptyStackException();
	 }
	 int result=top.data;
	 top=top.next;
	 return result;
 }
       public int peek() {
    	   if(isEmpty()) {
    			 throw new EmptyStackException();
    		 }
    	   return top.data;
       }
       public void print() {
    	   if(isEmpty()) {
    			 throw new EmptyStackException();
    		 }
    	   else {
          ListNode temp=top;
    	while(temp!=null) {
    		System.out.print(temp.data+" ");
    	temp=temp.next;
    	}   
       }
       }
    public static void main(String[] args) {
	Implement st=new Implement();
	st.push(4);
	st.push(3);
	st.push(2);
	st.push(1);
	st.print();
	System.out.println();
	System.out.println(st.pop());
	st.push(5);
    st.print();
    System.out.println();
    System.out.println(st.peek());
    }

}
