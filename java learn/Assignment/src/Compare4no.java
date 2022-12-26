import  java.util.Scanner;
public class Compare4no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a:");
		int a=sc.nextInt();
		System.out.println("enter b:");
		int b=sc.nextInt();
		System.out.println("enter c:");
		int c=sc.nextInt();
		System.out.println("Enter d:");
		int d=sc.nextInt();
		if(a==b&&b==c&&c==d)
		{
         System.out.println("All are same");
	    }
		else {
			int count=check_for_same(a,b,c,d);
			if(count!=1) {
				System.out.println(count+" are same");
			}
		}
			  {
				int res =  max_of_four(a,b,c,d);
				if(res!=0)
					System.out.println("max value is : " +res);
			}
		
	}
	static int check_for_same(int a,int b,int c,int d){
		
		int count=1;
		
		if(a==b)
			count++;
		if(a==c && a!=b)
			count++;
		if(a==d && a!=c)
			count++;
		if(b==c)
			count++;
		if(b==d && b!=c)
			count++;
		if(c==d )
			count++;
		
		return count;
	}
	
	static int max_of_four(int a, int b, int c, int d)
	{
	int max=0;
	 if((a>b) && (a>c) && (a>d))
	 max = a;
	 if((b>a) && (b>c) && (b>d))
	 max = b;
	 if((c>a) && (c>b) && (c>d))
	 max = c;
	 if((d>a) && (d>b) && (d>c))
	 max = d;
	 return max;
	}
	
}
