package Polymorphism;

public class Compiletime {

	public static void main(String[] args) {
		
       Compiletime c=new Compiletime();			
	c.jump();
	c.jump(123);
	c.jump("Burj Khalifa",4542);
	}
	public void jump() {
		System.out.println("Jump at high");
	}
	public void jump(int x) {
		System.out.println("Jump at height "+x);
	}
	public void jump(String n,int z) {
		System.out.println(n+" height is "+z+"m");
	}
	
}
