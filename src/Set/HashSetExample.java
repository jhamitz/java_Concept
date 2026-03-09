package Set;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String args[])
	{
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("Africa");
		hs.add("IND");
		hs.add("IND");//it wont allow duplicate values.
		System.out.println(hs);//[USA, UK, Africa, IND] rejected the duplicate value.
		hs.remove("UK");
		System.out.println(hs);//[USA, Africa, IND] rejected the duplicate value.
		System.out.println(hs.isEmpty());//false
		System.out.println(hs.size());//3

		

		
	}

}
