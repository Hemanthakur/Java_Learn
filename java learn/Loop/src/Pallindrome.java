import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		int rev=0;
		Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int temp=n;
   while(temp>0)
   {
	  int s=temp%10;
	   rev=rev*10+s;
      temp/=10;
   }
if(rev==n)
{
	System.out.println(n+" is pallindrome");
}
else
{
	System.out.println("NOt");
}
}
}