package intro;
import java.util.Scanner;
public class Question {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=(-n*n);
		 int d=1;
		System.out.println(s);
		for(int i=1;i<=n;i++) {	
			for(int j=1;j<=3;j++) {	
               System.out.print(s+" ");
			s=s+d;
			d=d+2;
			}
		}
	}

}
