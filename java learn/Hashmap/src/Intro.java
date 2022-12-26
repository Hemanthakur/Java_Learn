import java.util.*;
public class Intro {
 public static void main(String args[]) {
  HashMap<String,String> map=new HashMap<String,String>();
  map.put("India","Delhi");
  map.put("USA","Washington DC");
  map.put("England","London");
  map.put("Norway","oswla");
  System.out.println(map);
  map.remove("Norway");
  System.out.println(map.get("India"));
   		for(String i:map.keySet()) {
   			System.out.println("Key "+i+" Value "+map.get(i));
             }		
      }
 }
