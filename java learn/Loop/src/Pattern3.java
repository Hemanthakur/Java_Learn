import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for( int r=1;r<=n;r++)
		{
			for(int s=1;s<=r-1;s++)
			{
				System.out.print("  ");
			}
			for(int t=1;t<=n-r+1;t++)
			{
				System.out.printf("* ");
			}
		System.out.println();
		}
		
	}
}
