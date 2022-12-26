package classs;

class Derive
{
	String name;
	int age;
}

public class Basiccalss {

	public static void main(String[] args) {
   Derive a=new Derive();
   a.name="Nikhil";
   a.age=19;
   Derive b=new Derive();
   b.name="Akhil";
   b.age=17;
   System.out.println(a.name);
   System.out.println(a.age);
   System.out.println(b.name);
   System.out.println(b.age);

	}

}
