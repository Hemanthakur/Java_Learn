package Encapsulation;

public class Student {
    
	private String name;
	private int age;
    private int marks;
	
    public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>21) {
			System.out.println("You are not eligible to admission");
		}
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		if(marks<75.0) {
		System.out.println("Not eligible due to less marks");	}
		this.marks = marks;
	     
	}
     public void getName() {
    	 System.out.println(name);
     }
     public void setName(String name) {
    	 this.name=name;
     }
}
