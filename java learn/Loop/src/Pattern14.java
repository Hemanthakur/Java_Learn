
public class Pattern14 {

	public static void main(String[] args) {
		int n=5;
		int z=1;
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=z;k++)
			{
				System.out.print(k);
			}
		z=z+2;
	System.out.println();
		}
	}

}

