package Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Timeformat {

	public static void main(String[] args) {
	    LocalDateTime myDateObj = LocalDateTime.now();  
	    System.out.println("Before formatting: " + myDateObj); 
		DateTimeFormatter f= DateTimeFormatter.ofPattern("dd/mm/yyyy");
		String a=myDateObj.format(f);
		System.out.println(a);
	}
}
