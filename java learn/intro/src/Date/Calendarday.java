package Date;
import java.util.*;
import java.time.*;
public class Calendarday {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String month=sc.next();
	String day=sc.next();
	String year=sc.next();
	System.out.println(getDay(day,month,year));
	
	}
public static String getDay(String day,String month,String year) {
	Calendar cal=Calendar.getInstance();
	cal.set(Integer.valueOf(year),(Integer.valueOf(month)-1),Integer.valueOf(day));
	return cal.getDisplayName(cal.get(Calendar.DAY_OF_WEEK),Calendar.LONG,Locale.getDefault());
	}

}
