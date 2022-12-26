package Abstraction;

public class Shop {
 public static void Carrepair(Car car) {
	 System.out.println("Car is repaired");
 }
	public static void main(String[] args) {
		Audi audi=new Audi();
		Mercedes mercedes=new Mercedes();
	 
		Carrepair(audi);
	
	}

}
