package intro;
import java.util.*;

public class Questioncpp {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int [] student=new int[20];
      int count=0;
      for(int i=1;i<=5;i++) {
    	  System.out.print("Enter Student "+i+" marks:");
    	  student[i]=sc.nextInt();
      }
     for(int i=1;i<=5;i++) {
    	 for(int j=i+1;j<=5;j++) {
    		 if(student[i]==student[j]) {
    			 count++;
    		 }
    	 }
    	 if(count>=2) {
    		 System.out.println("duplicate marks "+student[i]+" comes "+count+" times");
    		 break;
    	 }
     }
      if(count<2) {
    	  System.out.println("No marks repeated");
      }
	}
}
