package condition;
import java.util.Scanner;

public class ifelseif {
public static void main(String[]args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the age:");
	int age=input.nextInt();	
			if(age>18)
	{
		System.out.printf("you are eligible to vote");
		
	}
			else if(age==18)
			{
				System.out.println("might be eligible:");
			}
	else {
		System.out.println("You are not eligiblle to vote");
	}
}

}
