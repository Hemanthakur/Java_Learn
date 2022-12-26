import java.util.Scanner;
public class Stringrepeatcount {
 public static int count(String c,char as) {
	 int co=0;
	 for(int i=0;i<c.length();i++) {
		 if(c.charAt(i)==as) {
			 co+=1;
		 }
	 }
	 return co;
 }
	
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the String:");
	 String c=sc.nextLine();
	 char as=sc.nextLine().charAt(0);	
	System.out.println(count(c,as));
     }
	}
