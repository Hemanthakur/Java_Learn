package oops;
 class car{
 int car,house,worth,bikes;
 void networth()
 {
	 System.out.println("Net worth of Hemant is "+worth+"$");
 }
 void description()
 {
	 System.out.println("Hemant has "+house+" house");
	 System.out.println("Hemant has "+car+" cars");
	 System.out.println("Hemant has "+bikes+" bikes");
 }
}
 class post{
		public void position() {
			System.out.println("CEO's of top 5 companies");
		}	
 }
 
public class MyClass {
	public static void main(String[] args) {
	car name=new car();
	post a=new post();
    name.car=5;
    name.bikes=5;
    name.house=5;
    name.worth=10000000;
	name.networth();
	name.description();
    a.position();
	}

}
