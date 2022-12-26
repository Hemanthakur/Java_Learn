import java.util.Scanner;
public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=n-i;j>0;j--)
			{
				System.out.printf(" ");
			}
			for(int k=1;k<((2*i)-i);k++)
			{
				System.out.printf(d+" ");
				d++;
			}
	System.out.println();
		}

	}

}
