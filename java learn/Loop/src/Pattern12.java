public class Pattern12 {

	public static void main(String[] args) {
		int r=5;
		int z=1;
		for(int i=0;i<r;i++)
		{
				for(int k=r-i;k>0;k--)	
				{
					System.out.printf(" ");
				}
				for(int j=1;j<=z;j++)
				{
					if(i==1&&j==2) {
						System.out.print("0");
					}
					else if((i==2&&j==4)||(i==2&&j==3)||(i==2&&j==2)) {
						System.out.print("0");
					}
					else if((i==3&&j==4)||(i==3&&j==3)||(i==3&&j==2)||(i==3&&j==5)||(i==3&&j==6)) {
						System.out.print("0");
					}
					else if((i==4&&j==4)||(i==4&&j==3)||(i==4&&j==2)||(i==4&&j==5)||(i==4&&j==6)||(i==4&&j==7)||(i==4&&j==8)) {
						System.out.print("0");
					}
					else {
				System.out.print(z-i);
				}
				}
				z+=2;
		System.out.println("");
		}
		
	}

}
