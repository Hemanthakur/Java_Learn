import java.util.Scanner;

public class Ques10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=6;
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
                         	}
		 int j = 0, temp=0; 
	        for (int i = 0; i < n; i++) { 
	            if (a[i] < 0) { 
	                if (i != j) { 
	                    temp = a[i]; 
	                    a[i] = a[j]; 
	                    a[j] = temp; 
	                }   
	                System.out.println(a[i]);
	                j++; 
	            } 
	        }
	        for (int i = 0; i < n; i++) 
	            System.out.print(a[i] + " "); 
	    
	}
}