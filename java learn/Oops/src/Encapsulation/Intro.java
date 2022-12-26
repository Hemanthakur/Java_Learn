package Encapsulation;

public class Intro {

	public static void main(String[] args) {
		Student obj=new Student();
        obj.setAge(18);
        obj.setMarks(82);
        obj.setName("Hemant");
		obj.getName();
		System.out.println(obj.getAge());
		System.out.println(obj.getMarks());
	}

}
