package classs;
class base{
	int n=50;
	float v=3.14f;
void method() {
	int z=10;
	float w=2.214f;
	System.out.println("class var 1:"+n);
	System.out.println("class var 1:"+v);
	System.out.println("method var 1:"+z);
	System.out.println("method var 2:"+w);
}
}
public class demo{
	
	public static void main(String[] args) {
		base a=new base();
		a.method();
	}
}

