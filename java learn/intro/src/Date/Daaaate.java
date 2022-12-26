package Date;
import java.util.*;
import java.*;
import java.text.Format;
import java.text.SimpleDateFormat;
public class Daaaate {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		System.out.println("Month"+(calendar.get(Calendar.MONTH)));
		System.out.println("Date"+(calendar.get(Calendar.DATE)));
		System.out.println("year"+(calendar.get(Calendar.YEAR)));		
		String [] days=new String[] {"Sun","Mon","tue","Wed","Thr","Fri","Sat"};
		System.out.println(days[calendar.get(Calendar.DAY_OF_WEEK)-1]);
	}

}
