package Date;
import java.util.*;
import java.text.*;
public class Dayformat {
		public static void main(String[] args) { 
		Format dateformat=new SimpleDateFormat("EEE,MM/dd/yyyy");
	    String s=dateformat.format(new Date());
		System.out.println(s);
		}

}