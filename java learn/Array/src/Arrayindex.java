
public class Arrayindex {

	public static void main(String[] args) {
		int aa=5;
		System.out.println(aa);
		int[] a;
		a=new int[4];
		System.out.println(a[0]);
        a[0]=10;
        a[1]=20;
        a[2]=40;
        a[3]=30;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]+"\n");
         for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
         System.out.println("\n");
	int[] even= {2,4,6,8,10};
	for(int i=0;i<even.length;i++)
	{
		System.out.println(even[i]);
	}
	
	}
}
