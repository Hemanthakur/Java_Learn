package Inheritence;

public class Student extends Person {
	public Student(String name) {
		super(name);
		System.out.println("Inside teacher cons");
	}
	public void learn() {
		System.out.println(name+" is learning");
	}
}
