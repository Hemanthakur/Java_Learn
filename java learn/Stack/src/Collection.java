import java.util.Stack;
public class Collection {
        public static void main(String[]args) {
	Stack<Integer> st=new Stack<Integer>();
     st.push(5);
     st.push(4);
     st.push(3);
     st.push(2);
     st.push(1);
     System.out.println(st);
        st.pop();
        System.out.println(st);
       int a=st.peek();
       System.out.println(a);
       int s=st.search(2);
       System.out.println(s);
        System.out.println(st.empty());
        
        }
}
