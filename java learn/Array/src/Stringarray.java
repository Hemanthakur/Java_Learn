
public class Stringarray {

	public static void main(String[] args) {
     String[] text=new String[3];
     text[0]="Hello";
     text[1]=" To";
     text[2]="Everyone";
     System.out.println(text[0]);
     System.out.println("\n");
     String[] Fruit= {"Apple","Mango","Orange"};
	 for(String fruits:Fruit) {
		 System.out.println(fruits);
	 }
	 System.out.println("\n");
	 String aa=null;
	 System.out.println(aa);	 
       String[] a=new String[4];
          System.out.println(a[2]);
          a[2]="one";
          System.out.println(a);
}
}

