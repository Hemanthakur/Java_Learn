
public class Builder {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder(" ");
		s.append("Hello"+",its me");
		s.append(" ");
		s.append("your boy ");
		s.append("Jvs");
		int a=10;
		String s1="Hello";
		System.out.println(s.toString());
	 //     System.out.print("Hello this \t is the format of\n Typing a new file \n Name:");
	   //  System.out.println("String.txt");
	 //	System.out.printf("Total"+s.length()+"\n");
	 	//System.out.printf("Total %-10d quantity %d",5 ,45);
	 	for(int i=0;i<3;i++) {
		System.out.printf("%-15s  %03d\n",s1,a);
	 	System.out.println(String.format("%2f",s));
	 	}
	}

}
