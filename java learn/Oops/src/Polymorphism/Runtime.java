package Polymorphism;

public class Runtime {

	public static void main(String[] args) {
       Dog d=new Dog();
		Pet p=d;
		d.walk();
		p.walk();
		System.out.println(p.name);
		System.out.println(d.name);
		
	
	}

}
