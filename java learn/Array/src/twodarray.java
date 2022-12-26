
public class twodarray {

	public static void main(String[] args) {
		int[][] v= { {2,3,4},
				     {5,6,7},
				     {4,7,1}
				   };
		for(int row=0;row<v.length;row++) {
		for(int col=0;col<v[row].length;col++)
		{
			System.out.print(v[row][col]+"\t");
		}
	System.out.println(v[row].length);
	}
		String[][] a=new String[3][3];
		a[0][0]="Nikhil";
		a[0][1]= "hello";
		a[0][2]="how";
		a[1][0]="Nikhilehfg";
		a[1][1]= "hello";
		a[1][2]="how";
		a[2][0]="Nikhilfggggggg";
		a[2][1]= "hello";
		a[2][2]="how";
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++)
			{
				System.out.print(a[row][col]+"\t");
			}
		System.out.println(a[row].length);
		}	
	}

}
