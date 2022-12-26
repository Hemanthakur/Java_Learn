package intro;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.IOException;

public class Buffr {
	static class  FastReader{
		BufferedReader br;
		StringTokenizer st;
	public FastReader() {
		br=new BufferedReader(new InputStreamReader(System.in));
	}
	String next() 
	  { while (st == null || !st.hasMoreElements()) 
		 { 	try{ st = new StringTokenizer(br.readLine()); } 
		 	catch (IOException e) { 	e.printStackTrace(); }
	     } 
		 return st.nextToken(); 
   	  } 
	int nextInt(){return Integer.parseInt(next()); }
	Long nextLong(){return Long.parseLong(next()); }
	Double nextDouble(){return Double.parseDouble(next());}
	String nextLine() 
	{ 	String str = ""; 
		  try
		  { str = br.readLine(); } 
		catch (IOException e) 
		  { e.printStackTrace(); } 
		 return str; }
	}
public static void main(String[]args) {
	FastReader fr=new FastReader();
	int n=fr.nextInt();
	Long l=fr.nextLong();
	Double d=fr.nextDouble();
	String s=fr.nextLine();
	String se=fr.next();
	System.out.println(n);
	System.out.println(l);
	System.out.println(d);
	System.out.println(s);
	System.out.println(se);
  }
}
