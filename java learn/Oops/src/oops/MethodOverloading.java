package oops;

public class MethodOverloading {
	public static void main(String[] args) {
		int x=10;
		max(x,5);
		max(2,6,4);

	}
	static void max(int a,int b) {
		  if(a>b)
		  {
			 System.out.println(a); 
		  }
		  else
		  {System.out.println(b);  
		  }
	                             }
	static void max(int a,int b,int c) {
		  if(a>b&&a>c)
		  {
			 System.out.println(a); 
		  }
		  else if(b>c)
		  {System.out.println(b);  
		  }
		  else
		  { System.out.println(c);}
	  }
}
