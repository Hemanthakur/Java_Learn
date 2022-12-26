package statement;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the 1st no:");
    int a=sc.nextInt();
    
    System.out.println("Enter an operation:");
    sc.nextLine();
    char c=sc.nextLine().charAt(0);
	System.out.println("Enter the 2nd no:");
    int b=sc.nextInt();
    int res=0;
	switch(c) {
		case '+':res=a+b;
		break;
		case '-':res=a-b;
		break;
		case '*':res=a*b;
		break;
		case '/':res=a/b;
		break;
		default:
			System.out.println("Invalid option");
	}
	System.out.println("Rsult of a and b is:"+res);
	
	}
}
