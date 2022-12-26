public class Ques8 {

	public static void main(String[] args) {
  int a[]= {0,1,2,1,0,2,0,1,2,2};
  int s=a.length;
  sort(a,s);
  printArray(a, s); 
	}
static void sort(int arr[],int s) {
	int l=0;
	int h=s-1;
    int  m=0,temp=0;
    while(m<=h) {
    	switch(arr[m]) {
    	case 0:{
    		temp = arr[l]; 
        arr[l] = arr[m]; 
        arr[m] = temp; 
        l++; 
        m++; 
        break; 
         } 
    	case 1: 
            m++; 
            break; 
     case 2: { 
            temp = arr[m]; 
            arr[m] = arr[h]; 
            arr[h] = temp; 
            h--; 
            break; 
     }    
    } 
}
}
static void printArray(int a[], int s) 
{ 
    int i; 
    for (i = 0; i < s; i++) 
        System.out.print(a[i] + " "); 
    System.out.println(""); 
} 
}
