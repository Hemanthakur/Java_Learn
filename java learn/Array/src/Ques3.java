import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int max=0;
	   int a[]=new int[n];	
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	int min=a[0];
	for(int i=0;i<a.length;i++) {
		 if(a[i]>max) {
	            max =a[i];
        	} 
		 if(a[i]<min) {
	      min = a[i];
	             }
	}
	System.out.println("min:"+min);
	System.out.println("max:"+max);
	}
}
