package condition;

import java.util.Scanner;

public class Oddoreven {
public static void main(String[] args) {
	int n;
    Scanner input=new Scanner(System.in);
    System.out.printf("Enter the number you want to check:");
     n=input.nextInt();
    if(n%2==0)
    {
    	System.out.println("even");
    }
    else
    {
    	System.out.println("odd");
    }
	}
}
