import java.util.Scanner;
public class Fabonacci {

	public static void main(String[] args) {
		int b=0,sum=1;
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter the Number:");
		int a=sc.nextInt();
		System.out.print(b+"  ");
		System.out.print(sum+"  ");
		for(int i=0;i<=a-2;i++)
		{
			int c=sum+b;
			
			System.out.print(c+"  ");
		     b=sum;
		     sum=c;
		}

	}

}
