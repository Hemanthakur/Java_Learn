import java.util.Scanner;

public class Ques9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int range=0;
		int min=0,max=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
	   for(int i=0;i<a.length;i++) {
		   if(a[i]>max) {
			   max=a[i];
		   }
	   if(a[i]<min) {
		   min=a[i];
	   }
	   }
	range=max-min;
	System.out.println(range);
	}

}
