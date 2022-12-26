
public class Aray {

	public static void main(String[] args) {
	String [] cars;
		cars=new String[6];
    cars[0]="Fortuner";
    cars[1]="Z eight hundred";
    cars[2]="Duke";
    cars[3]="Mustang";
    cars[4]="Classic enfield";
    cars[5]="Mercedes";
    for(int i=0;i<cars.length;i++)
    {
    	System.out.println(cars[i]);
    }
		
		/*  String[] cars= {"Audi","BMW","Jaguar","Mustang","Ford","Toyota","Mercedes"};
      System.out.println(cars[6]); */
    
    int []rollno=new int[6];
	rollno[0]=1;
	rollno[1]=2;
	rollno[2]=3;
	rollno[3]=4;
	rollno[4]=5;
	rollno[5]=6;
	for(int j=0;j<rollno.length;j++)
	{
		System.out.println(rollno[j]);
	}
	
	char[] roll={'A','B','C','D','E'};
	for(int k=0;k<roll.length;k++)
	{
		System.out.println(roll[k]);
	}
	
	}

}
