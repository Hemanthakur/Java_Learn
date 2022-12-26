
public class Indexanagram {

	public static void main(String[] args) {
		String a="sjrfd12";
		String b="rsjdf12";
		boolean isanagram=true;
		
		
		int al[]=new int[256];
		int bl[]=new int[256];
		for(char c:a.toCharArray()) {
			int index=(int)c;
			al[index]++;
		}
		for(char c:b.toCharArray()) {
			int index=(int)c;
			al[index]--;
		}
        for(int i=0;i<256;i++)
        {
        	if(al[i]!=0)
        	{
        		isanagram=false;
        		break;
        	}
        }
	
	if(isanagram)
	{
		System.out.println("Anagram");
	}
	else
	{
		System.out.println("Not Anagram");
	}
 }
}
