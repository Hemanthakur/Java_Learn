package Inheritence;

public class Main {

	public static void main(String[] args) {
          Teacher t1=new Teacher(" Harry");
		Person p=t1;
		
		Teacher t=(Teacher)p;
		boolean g=t1 instanceof Teacher;
		Singer s=new Singer("Ram");
		t.walk();
		t.eat();
		t.sleep();
		t.teach();
		p.laugh();
		s.eat();

	}

}
