package operators;

public class logical {
 public static void main(String[] args) {
	 //8->1000 2 bit shift right 0010
	 //2->0010
	 //8 for 2 bit right shift 10 0000
	 int a=8,b=2,m=6;
	 a=a>>2;
     b=b<<2;
     int c= a|b;
	 int d=a&b;
	 int e=++m+m++ + ++m+ ++m;//7+7+9+10
	 String q="Hello";
	 String x="Nikhil";
	  /*LEFT AND RIGHT SHIFT*/ System.out.println(a+"   "+b);
     /*logical OR*/   System.out.println(c);
	/*logical AND*/   System.out.println(d);
	/*INC / DEC*/	System.out.println(e);
     System.out.println(q.concat (x));
 }
}
