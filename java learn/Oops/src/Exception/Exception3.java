package Exception;
import java.util.Scanner;
public class Exception3 {

	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a=sc.nextInt();
	sc.close();
	int c=n/a;
	System.out.println(c);
	}
		catch(ArithmeticException e) {
			System.out.println("Can't divide with zero");
		}
	catch(Exception e) {
		System.out.println("Mismatch");
	}
		
	}

}
