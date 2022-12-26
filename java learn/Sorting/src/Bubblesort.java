import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		int [] a=new int[5];
		System.out.println("Enter 1 matrix:");
			Scanner sc=new Scanner(System.in);
			for(int w=0;w<5;w++) {
				a[w]=sc.nextInt();
			}
	//optimization	boolean sort=true;
		int n=a.length;
        for(int i=0;i<n-1;i++)
        {
        	for(int j=0;j<n-1-i;j++)
        	{
        		if(a[j+1]<a[j])
        		{
        			int temp=a[j+1];
        			a[j+1]=a[j];
        			a[j]=temp;
        //          sort=false;        		
        		}
        	}
        //if(sort)break;
        }
	
	for(int q:a)
	{
		System.out.print(q+"  " );
	}			
}
}