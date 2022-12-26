
public class Pattern10 {

	public static void main(String[] args) {
		int r=6;
		for(int i=1;i<=r;i++)
		{
				for(int k=r-i;k>0;k--)	
				{
					System.out.printf(" ");
				}
				for(int j=1;j<=((2*i)-i);j++)
				{
					if(j==i)
					{
						System.out.print("1 ");
					}
					else if(j==2&&i==4)
					{
					System.out.print("3 ");
					}
					else if(j==2&&i==5)
					{
					System.out.print("4 ");
					}
					else if(j==3&&i==5)
					{
					System.out.print("6 ");
					}
					else if(j==2&&i==6)
					{
					System.out.print("5 ");
					}
					else if(j==3&&i==6)
					{
					System.out.print("10 ");
					}
					else if(j==4&&i==6)
					{
					System.out.print("10 ");
					}
					else {
				System.out.printf(j+" ");
			}
				}
		System.out.println("");
		}

	}

}
