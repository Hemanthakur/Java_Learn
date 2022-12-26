import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		int [] v=new int[6];
		v [0]=10;
		v[1]=20;
		v[2]=12;
		v[3]=65;
		v[4]=87;
		v[5]=19;
		int s=0;
		for(int i=0;i<v.length;i++)
		{
		s+=v[i];		
		}
	System.out.println(s);
	}
	
}
