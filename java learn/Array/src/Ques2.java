import java.util.Scanner;
public class Ques2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean x=false;
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[m];
		for(int i=0;i<m;i++)
		{
			a[i]=sc.nextInt();
	}
			   for(int i=0;i<=n;i++) {
		   if(a[i]==n) {
			   x=true;
	        break;           }
		   else {
			   x=false;
		   }
			   }
  System.out.println(x);
	}
}
