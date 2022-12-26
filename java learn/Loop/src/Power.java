import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		int a=sc.nextInt();
		System.out.println("Enter power:");
        int n=sc.nextInt();
        int p=1;
        for(int i=0;i<n;i++)
        {
        	p=p*a; 
        }
        	System.out.println(p);
	  
	}

}
