package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetExample2 {
	public static void main(String args[])
	{
	 // using iterator
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("animal");
		hs.add("Bird");
		hs.add("fruits");
		hs.add("Tress");
		Iterator<String> i = hs.iterator();
		 while(i.hasNext())
		 {
			 System.out.println(i.next());
		 }
		
	}

}
