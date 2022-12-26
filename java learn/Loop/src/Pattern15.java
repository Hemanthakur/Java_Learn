import java.util.*;
public class Pattern15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=7;
        for(int i=0;i<=n/2;i++) {
         	for(int k=0;k<n;k++) {
         		if((k>=(n/2)-i)&&(k<=(n/2)+i)) { 
         	    	  System.out.print(" ");
         	      	}
         	      else {
         	    	  System.out.print("*");
         	      }  	
         		}
       System.out.println();
         }
         for(int i=0;i<=n/2-1;i++) {
          	for(int k=0;k<n;k++) {
          		if( (k<=i) ||(k>=(n-i-1)) ) { 
          	    	  System.out.print("*");
          	      	}
          	      else {
          	    	  System.out.print(" ");
          	      }  	
          		}
        System.out.println();
          }

	}

}
