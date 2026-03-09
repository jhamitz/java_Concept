package ExamplMap;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class HashMapExample4 {
	public static void main(String args[])
	{
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1,"mity");
		hm.put(2,"tanu");
		hm.put(3,"rosy");
		hm.put(4,"Mala");
		hm.put(5,"Ayush");
		//System.out.println(hm);
		Set ss =hm.entrySet();// entrySet returns the key and value of Map as a set
		Iterator i = ss.iterator();
		 while(i.hasNext())
		 {
			 Map.Entry mp = (Map.Entry)i.next();//Map.Entry represents a single key–value pair in a Map.
			 System.out.println(mp.getKey());
			 System.out.println(mp.getValue());
		 }
		
		
				
		
	}
}
