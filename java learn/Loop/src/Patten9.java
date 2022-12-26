
public class Patten9 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			
		for(int k=1;k<=i;k++)
		{
			if(k==1||k==i||i==n)
			{
			System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
		}
	}

}
