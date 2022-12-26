import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nummber you want to check:");
        int a=sc.nextInt();
        boolean prime=true;
        for(int i=2;i*i<=a;i++)
        {
        	if(a%i==0) {
        	prime=false;
        	break; 
        	}
        }
        if(a<2) {
        	prime=false;
        }
	System.out.println("Is prime"+prime);
	}

}
