
public class Nesteredfor {

	public static void main(String[] args) {
//	for(int i=1;i<=100;i++)
	//	{	System.out.println(i);
		//	if(i==35)
	//	break;
		//	}
		int t=1;
	for(int i=1;i<=10;i++)
	{
		for(int j=1;j<=20;j++)
		{
			t=i*j;
			System.out.print(t+" \t");
		}
		System.out.println();
	}
}

}
