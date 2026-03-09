package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasMapExample2 {

	public static void main(String[] args) {
		//iterator
		HashMap<Integer, String> hmap = new HashMap<Integer , String>();
		hmap.put(1,"abcd");
		hmap.put(2,"efg");
		hmap.put(2,"hij");
		hmap.put(3,"klm");
		hmap.put(4,"nop");
		
		Set sn = hmap.entrySet();//hasmap converted into set
		Iterator i = sn.iterator();
		
		while(i.hasNext())
		{
			Map.Entry mp =(Map.Entry).i.next();
		}
		
		
		
		
		
		
		

	}

}
