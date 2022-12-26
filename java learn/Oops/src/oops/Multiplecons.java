package oops;

public class Multiplecons {
         int home=1,worth,floor;
         String name;
         Multiplecons(int x,String n){
        	 floor=x;
        	 worth=100000;
        	 name=n;
         }
         Multiplecons(int x,int y,int z,String n){
        	 home=x;
        	 floor=y;
        	 worth=z;
        	 name=n;
         }
	public static void main(String[] args) {
		Multiplecons intro=new Multiplecons(2,"Akhil");
		Multiplecons info=new Multiplecons(5,4,60000000,"Nikhil");
        System.out.println("Home="+intro.home+"\n"+"Floor="+intro.floor+"\n"+"Worth="+intro.worth+"\n"+"Name="+intro.name);		
        System.out.println();
        System.out.println("Home="+info.home+"\n"+"Floor="+info.floor+"\n"+"Worth="+info.worth+"\n"+"Name="+info.name);		

	}

}
