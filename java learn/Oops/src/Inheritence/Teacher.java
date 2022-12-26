package Inheritence;

public class Teacher extends Person {
	public Teacher(String name) {
		super(name);
		System.out.println("Inside teacher cons");
	}
	
	public void teach() {
		System.out.println(name+" is teaching");
	}
	public void laugh() {
		super.laugh();
		System.out.println(name+" is laughingt");
	}
}
