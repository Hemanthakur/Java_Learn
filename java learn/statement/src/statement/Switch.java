package statement;
import java.util.Scanner;

public class Switch {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.printf("Enter your command to run:");
		String a=input.nextLine();
		switch(a) {
			case "start":System.out.println("Machine start running");
			break;
			case "stop":System.out.println("Machine stop running");
			break;
			default: System.out.println("Command not recognize");
	              }
     }
}