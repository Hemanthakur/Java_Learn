import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. you want to factorial:");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
			{
			fact=fact*i;
		System.out.println(fact);
			}
      System.out.println("Factorial of "+a+" is:"+fact);
	}

}
