
public class Intimplement {
   static final int Max=1000;
   int a[]=new int[Max];
   int top;
   boolean isEmpty() {
	     return (top<0); 
   }
   Intimplement(){
	   top=-1;
   }
    public void push(int x) {
    	if(top>=Max-1) {
    		System.out.println("Overflow");
    	}
    	else {
    		a[++top]=x;
    		System.out.println(x+" is pushed into stack");
    	}
    }
    public int pop() {
    	if(top<0) {
    		System.out.println("underflow");
    	return 0;
    	}
    	else {
    		int x=a[top--];
    	return x;	
    	}
		
    }
    int peek() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top]; 
            return x; 
        } 
    } 
    public static void main(String[] args) {
     Intimplement in=new Intimplement();
     in.push(4);
     in.push(5);
     in.push(7);
     in.push(1);
     System.out.println(in.pop()+" is poped from stack");
	System.out.println(in.peek()+" is peeked element");
    }
}
