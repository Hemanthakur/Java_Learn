import java.util.HashMap; 
   class Key { 
		  String key; 
	Key(String key) { this.key = key; 	} 
		public int hashCode() 
		{ 
			int hash = (int)key.charAt(0); 
			System.out.println("hashCode for key: "+ key + " = " + hash); 
			return hash; 
		} 
		public boolean equals(Object obj) 
		{ 
			return key.equals(((Key)obj).key); 
		} 
	} 
   public class Implementation{ 
		public static void main(String[] args) 
		{ 
			HashMap map = new HashMap(); 
			map.put(new Key("vishal"), 20); 
			map.put(new Key("sachin"), 30); 
			map.put(new Key("vaibhav"), 40); 
			System.out.println("Value for key sachin: " + map.get(new Key("sachin"))); 
			System.out.println("Value for key vaibhav: " + map.get(new Key("vaibhav"))); 
		} 
	} 


