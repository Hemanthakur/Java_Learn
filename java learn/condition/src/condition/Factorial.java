package condition;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
	     int n,factorial=1;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the factorial number:");
	n=input.nextInt();
	for(int i=1;i<=n;i++)
	{
		factorial=factorial*i;
	}
	System.out.println("factorial of "+ n+":"+factorial);
	}
	
}
