package intro;
import java.util.Scanner;
   
public class Corona {
	static boolean find(String a, String b) {
		  int m=a.length();
		  int n=b.length();
	  int j = 0,q=0;

	  while(j<m &q<n) {
		if(a.charAt(j)==b.charAt(q)) {
			j+=1;
			q+=1;
		}
	}
	return   j==m;
	}
	
	public static void main(String[]args) {
  Scanner sc=new Scanner(System.in);
  String b=sc.nextLine();
  String s[]=new String[sc.nextInt()];
  sc.nextLine();
  for(int i=0;i<s.length;i++) {
	  s[i]=sc.nextLine();  
  	}
	/* for(String str:s) {
	   boolean as=find(str,b);
		 if(as==true){
		System.out.println("POSITIVE");
	}
	else {
		System.out.println("NEGATIVE");
	  }
    }*/
	
  }
}
