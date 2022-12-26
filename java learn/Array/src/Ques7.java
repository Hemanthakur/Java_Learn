import java.util.Scanner;

public class Ques7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int n=sc.nextInt();
		int aa=sc.nextInt();
		int a[]=new int[aa];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
            if(a[i]==n) {
            	count+=1;
            }
		}
	System.out.println(count);
	}

}
