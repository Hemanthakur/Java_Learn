package condition;
import java.util.Scanner;
public class Petals {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of petals");
		for(int i=1;i<=5;i++)
		{
		int p=sc.nextInt();
		if(p%2==1)
		{
			System.out.println("She loves me");
		}
		else {
			System.out.println("She loves me not");
		}
	}
		
  }
}