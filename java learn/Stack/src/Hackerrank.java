import java.util.Scanner;
import java.util.Stack;

public class Hackerrank {
	Stack<Integer> st=new Stack<Integer>();	
	Stack<Integer> sm=new Stack<Integer>(); 
	public void push(int p) {
		if(st.size()==0)
        {

               sm.push(p);
               st.push(p);
        }
      else
          {
               if(p>=sm.peek())
                   {

               sm.push(p);
               }
                st.push(p);
           }    
     }
	 public void pop() {
		 if(st.peek()==sm.peek())
             sm.pop();
         st.pop();	 
	 }
	 public int print()
	 {
		 return sm.peek();
	 }
	public static void main(String[] args) {
		Hackerrank h=new Hackerrank();
		Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				int a=sc.nextInt();
				if(a==1) {
					int p=sc.nextInt();
					h.push(p);
						}
				else if(a==2) {
					h.pop();
				}
				else if(a==3) {
					System.out.println(h.print());
				}
			}
	}
}

/*
import java.io.*;
import java.util.*;

public class Solution {
    private static void getMaxElementFromStack()
    {
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> onlyMaxs = new Stack<Integer>();
        
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.nextLine());
        int temp = 0;
        
        
        
        while(sc.hasNext())
        {
            String type[] = sc.nextLine().split(" ");
            switch(type[0])
            {
                case "1":
                temp = Integer.parseInt(type[1]);
                stack.push(temp);
                 if(onlyMaxs.isEmpty() || onlyMaxs.peek() <= temp)
                     onlyMaxs.push(temp);
                break;
                case "2":
                temp = stack.pop();
                if(temp == onlyMaxs.peek())
                    onlyMaxs.pop();
                break;
                case "3":
                System.out.println(onlyMaxs.peek());
            }
            N--;
        }
        
        while(N-- > 0)
            System.out.println(onlyMaxs.peek());
        
    }
    public static void main(String[] args) {
        getMaxElementFromStack();
    }
}
*/