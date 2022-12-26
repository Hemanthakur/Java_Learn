package statement;

import java.util.Scanner;

public class weekdays {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.printf("Enter your date:");
		int a=input.nextInt();
		switch(a) {
		default: System.out.println("Command not recognize");
	
		case 1:
		//for multiple case in 1 switch case	case 2: 
				System.out.println("Sunday");
			break;
			case 2:System.out.println("Monday");
			break;
			case 3:System.out.println("Tuesday");
			break;
			case 4:System.out.println("Wednesday");
			break;
			case 5:System.out.println("Thrusday");
			break;
			case 6:System.out.println("Friday");
			break;
			case 7:System.out.println("Saturday");
			break;
				              }
	}

}
