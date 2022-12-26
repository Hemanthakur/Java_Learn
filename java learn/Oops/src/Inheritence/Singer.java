package Inheritence;

public class Singer extends Person{
	public Singer(String name) {
		super(name);
		System.out.println("Inside teacher cons");
	}
	public void sing() {
		System.out.println(name+" is singing");
	}

}
