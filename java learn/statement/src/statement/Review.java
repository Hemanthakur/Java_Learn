package statement;
import java.util.Scanner;
public class Review {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Please rating out of 5:");
        int r=sc.nextInt();
        switch(r) {
        case 1:
        case 2:
        	System.out.println("Bad rating");
            break;
        case 3:
        	System.out.println("Average rating");
            break;
        case 4:
        case 5:
        	System.out.println("Good rating");
        	break;
        	default:
        		System.out.println("Wrong rating");   
        		}
	}

}
