package Exception;
import java.io.*;
import java.util.*;

public class Exception1 {

	    public static void main(String[] args) {
	    try{   
	    Scanner scan = new Scanner(System.in);
	    int input1 = scan.nextInt();
	    int input2 = scan.nextInt();
	    scan.close();
	    int sum;
        sum = input1 / input2;
         System.out.println(sum);
	    }
	        catch(ArithmeticException e){
	    System.out.println("java.lang.ArithmeticException: / by zero");
	}
	catch(InputMismatchException e){
	     System.out.println("java.util.InputMismatchException");
	}

	    }
	 
	    }
