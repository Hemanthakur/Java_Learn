import java.util.*;
import java.io.*;
public class ArrarImp {
	public static void main(String[] args) {
		Array obj = new Array(); 
        obj.Root(1); 
        obj.left(2, 0);
        obj.Right(3, 0); 
        obj.left(6, 2); 
        obj.Right(7, 2); 
        obj.left(4, 2); 
        obj.print(); 
	}

}
class Array{
	public int isEmpty() {
		return root=0;
	}
	 int root=0;
	 int[] arr=new int[10];
	 public void Root(int key) {
	 	arr[0]=key;
	 } 
	public void left(int key,int root) {
		int t=(root*2)+1;
		if (arr[root]==isEmpty()) {
		System.out.printf("Can't set the child at %d position",t);	
		}
		else {
			arr[t]=key;
		}
	}
	public void Right(int key,int root) {
		int t=(root*2)+2;
		if (arr[root]==isEmpty()) {
			System.out.println();
		System.out.printf("Can't set the child at %d position",t);	
		}
		else {
			arr[t]=key;
		}
	}
	public void print() {
		System.out.println();
		for(int i=0;i<10;i++) {
			if(arr[i]!=isEmpty())
				System.out.print(arr[i]+" ");
			else
				System.out.print("-");
		}
	}
}