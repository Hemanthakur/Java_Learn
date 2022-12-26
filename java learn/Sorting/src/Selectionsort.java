
public class Selectionsort {

	public static void main(String[] args) {
	  int[] a= {2,4,7,-1,6,0};
	  int n=a.length;
	  for(int i=0;i<n-1;i++)
	  { 
		  int min=i;
		  for(int j=i;j<n;j++)
		  {
			  if(a[j]<a[min])
			  {
				  min=j;
			  }
		  }
        int temp=a[i];
        a[i]=a[min];
        a[min]=temp;
	  }
    for(int q:a)
    {
    	System.out.print(q+" ");
    }
	}

}
