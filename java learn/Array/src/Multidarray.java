import java.util.Scanner;
public class Multidarray {

	public static void main(String[] args) {
    // int [][] a=new int[3][3];
     //int b[][]= { {1,2,3},
    	//	 {3,3,3},
    		// {5,6,7} };
    //System.out.println(b[2][1]); 
	int [][] a=new int[3][3];
	int [][] b=new int[3][3];
System.out.println("Enter 1 matrix:");
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
		a[i][j]=sc.nextInt();
	}
	}
	System.out.println("Enter 2 matrix");
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
		b[i][j]=sc.nextInt();
	}
	}
	int [][] c=new int[3][3];
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
		 c[i][j]=a[i][j]+b[i][j];
	}
	}
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
		 System.out.print(c[i][j]+" ");
	}	
		System.out.println();
	}
	}
}


