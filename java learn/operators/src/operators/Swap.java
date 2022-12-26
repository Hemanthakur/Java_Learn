package operators;
import java.util.Scanner;
public class Swap {
	public static void swap(int x,int y) {
		int temp;
	   temp=x;
		x=y;
		y=temp;
	}
	public static void main(String[]args) {
	 	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int d=sc.nextInt();
	int e=sc.nextInt();
	System.out.println(a+" "+b+" "+c+" "+d+" "+e);
    System.out.println("Enter 1st value:");
	int x=sc.nextInt();
	System.out.println("Enter 2nd value:");
     int y=sc.nextInt();
     swap(x,y);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	}
}
