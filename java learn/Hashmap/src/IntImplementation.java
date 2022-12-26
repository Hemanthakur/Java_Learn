public class IntImplementation {
    final static int max=1000;
    	static boolean[][] prsnt = new boolean[max + 1][2]; 
    	static boolean search(int x)  
    	{ 
    	    if (x >= 0)  
    	    { 
    	        if (prsnt[x][0] == true)  
    	        { 
    	            return true; 
    	        }  
    	        else 
    	        { 
    	            return false; 
    	        } 
    	    }   
    	    x= Math.abs(x); 
    	    if (prsnt[x][1] == true)  
    	    { 
    	        return true; 
    	    } 
    	  
    	    return false; 
    	} 
    	  
    	static void insert(int a[], int n)  
    	{ 
    	    for (int i = 0; i < n; i++)  
    	    { 
    	        if (a[i] >= 0)  
    	        { 
    	            prsnt[a[i]][0] = true; 
    	        }  
    	        else 
    	        { 
    	            prsnt[Math.abs(a[i])][1] = true; 
    	        } 
    	    } 
    	} 
	public static void main(String[] args) {
	int a[]= {1,5,2,-7,2,9,-10};
	int n=a.length;
	insert(a,n);
	int x=-10;
	if(search(x)==true) {
		System.out.println("Present");
	}
	else {
		System.out.println("Absent");
	}
	}
}
