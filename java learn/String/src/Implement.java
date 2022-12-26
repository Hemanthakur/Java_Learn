
public class Implement {

	public static void main(String[] args) {
	//by literal
		String na="Nikhil"; //String pool Area
		String nam="Nikhil Thakur jvs";
		String na1="Nikhil Thakur jvs";// same
		String name=new String("   Hemant    "); //Heap Area and make copy in String pool area
		String cars="Audi,BMW,Mercedes,Ford,Rovers";
		System.out.println("split");
		String[]laxuray=cars.split(",");//to check split array 
		for(String ca:laxuray)
		{
			System.out.println(ca);
		}
		System.out.println(nam==na1);//check equal or not with memory
		System.out.println(name==nam);//same
		System.out.println(nam.charAt(4));//for index value
		System.out.println(nam.length());//for length
		System.out.println(nam.substring(6));// for substing after index
		System.out.println(nam.substring(3,15));// for substing b/w initial and end
		System.out.println(nam.equals(na));//to check equal or not
		System.out.println(nam.contains("N"));//find present or not
		System.out.println(nam.isEmpty());//to check empty or not
		System.out.println(nam.concat(na));//for concat ("sharma ")
		System.out.println(nam.replace("jvs","JV"));//replace first by second
		System.out.println(nam.indexOf("j"));//to tell index number
		System.out.println(nam.toUpperCase());//Uppercase alll letter
		System.out.println(na.toLowerCase());//loweecase all letter
		System.out.println(name.trim());//remove trailing spaces
	}

}
