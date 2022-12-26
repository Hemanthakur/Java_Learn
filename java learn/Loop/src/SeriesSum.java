import java.util.Scanner;
public class SeriesSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        float a=1,sum=0;
        System.out.println("Enter deno:");
        float n=sc.nextFloat();
        for(int i=1;i<=n;i++)
        {
        	if(i%2==0)
        	{
         sum=sum-(a/i);
        	}
        	else
        	{
        		sum=sum+(a/i);
        	}
        }
    	System.out.println(sum);
	
	
	}

}
