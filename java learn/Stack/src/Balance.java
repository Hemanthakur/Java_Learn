import java.util.*;
public class Balance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
	while(t--!=0) {
		String s=sc.nextLine();
		Stack<Character> Stack=new Stack<>();
		boolean balanced=true;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch == '{' || ch== '[' ||ch=='(') {
				Stack.push(ch);
			continue;
			}
		    	if(Stack.isEmpty()) {
			      balanced=false; 
			      break;}
		    	if(ch==')') {
				 	if(Stack.peek()=='(') {
					Stack.pop();}
				   else {
						balanced=false;
					 	break; }
				 	}
		    	if(ch=='}') {
			 	if(Stack.peek()=='{') {
				Stack.pop();}
			 	else {
				balanced=false;
	              	break;}
			             }
			  if(ch==']') {
		        	if(Stack.peek()=='[') {
					Stack.pop(); }
		        	else {
					balanced=false;
			     	break;}
			        }
				}
         if(!Stack.isEmpty()) {
	      balanced=false;
                   }
  if(balanced) {
	  System.out.println("balanced");
  }
  else {
	  System.out.println("Not balanced");
  }
	}
	}
}