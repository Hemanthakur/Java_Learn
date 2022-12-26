import java.util.Scanner;
import java.*;
public class Insert {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String arry[][]={ {"ram,21","sumit,23"},{"umesh,21"},{"pardeep,17","pawan,34","manoj,18"}
	     };
        int[] numbers = new int[10];
        int x = 0;
        for (String[] strings : arry) {
            for (String string : strings) {
            	numbers[x++] = returnInt(string);
            }
        }
        for (int i:numbers) {
            if(i != 0){
                System.out.print(i + " ");
            }
        }
    }
    public static int returnInt(String str) {
        int numberFound;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 47 && str.charAt(i) < 58  ) {
                for (int j = i; j < str.length(); j++) {
                    if (!(str.charAt(j) > 47 && str.charAt(j) < 58) || j == str.length()-1) {
                        numberFound = Integer.parseInt(str.substring(i,j+1));
                        return numberFound;
                    }
                }
            }
        }
        return Integer.MIN_VALUE;
    }
}
