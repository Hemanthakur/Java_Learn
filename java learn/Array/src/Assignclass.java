import java.util.Scanner;
public class Assignclass {

	public static void main(String[] args) {
		int avg=0;
	System.out.println("Enter the no. of student:");
	 Scanner sc =new Scanner(System.in);
	 int n=sc.nextInt();
	int[] marks=new int[n];
	System.out.println("Enter Marks:");
	for(int i=0;i<n;i++)
	{
		marks[i]=sc.nextInt();
		 avg=avg+marks[i];    
	}
  avg=avg/n;
  System.out.println("Avg ="+avg);
	}

}
 	