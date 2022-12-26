import java.util.*;
public class Ques {
	   static final int Max=1000;
	   int a[]=new int[Max];
	   int top;
	   boolean isEmpty() {
		     return (top<0); 
	   }
	   Ques(){
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
	    public int print() {
	   int m=a[0];
	    	for(int i=0;i<a.length;i++) {
	    	if(a[i]>m)
	    		m=a[i];
	    }
	    	return m;
	    }
	  	public static void main(String[] args) {
	Ques q=new Ques();
	  		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		int a=sc.nextInt();
		if(a==1) {
			int p=sc.nextInt();
			q.push(p);
		}
		else if(a==2) {
			System.out.println(q.pop());
		}
		else if(a==3) {
			System.out.println(q.print());
		}
	}
	}

}
