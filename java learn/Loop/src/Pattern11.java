public class Pattern11 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
		for(int k=1;k<=n;k++)
		{
			if(i==n||(n-i+1)==k||k==n)
			{
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
		}

	}

}
