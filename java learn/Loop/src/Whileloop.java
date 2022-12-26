import java.util.Scanner;
public class Whileloop {
//Sum of digits
	public static void main(String[] args) {
	int sum=0;
		Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int temp=n;
   while(temp>0)
   {
	   int s=temp%10;
	   temp=temp/10;
	   sum=sum+s;
   }
    System.out.println(sum);
	//for check interger no.
	int num=(int)Math.log10(n)+1;
	System.out.println(num);
	}
}
