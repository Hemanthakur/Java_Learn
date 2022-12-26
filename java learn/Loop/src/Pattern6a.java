public class Pattern6a {

	public static void main(String[] args) {
		int r=5;
		for(int i=1;i<=r;i++)
		{
				for(int k=r-i;k>0;k--)	
				{
					System.out.printf(" ");
				}
				for(int j=1;j<=((2*i)-i);j++)
				{
				System.out.printf("* ");
			}
		System.out.println("");
		}
		
	}

}
