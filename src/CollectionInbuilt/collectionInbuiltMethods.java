package CollectionInbuilt;

import java.util.ArrayList;
import java.util.Collections;

/* Arraylist support->sort(),reverse(),min(),max(),frequency(),swap(), suffle(), disjoint(),addAll()*/
/*Hashset supports:->min(),max(),addAll(),fequency()--limited,disjoint();
  max() and min() only on map values.*/


public class collectionInbuiltMethods {
	public static void main(String args[])
	{
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(23);
		ar.add(56);
		ar.add(98);
		ar.add(87);
		ar.add(67);
		ar.add(98);
		
		ArrayList<String> s = new ArrayList<String>();
		s.add("Java");
		s.add("c++");
		s.add("php");
		s.add("c");

		
		System.out.println(ar);
		//collection.sort():- used to sort the element
		Collections.sort(ar);
		System.out.println(ar);//[23, 56, 67, 87, 98]
		 //collection.min(): provides minimum element from array list
		System.out.println(Collections.min(ar));//23
		System.out.println(Collections.max(ar));//98
		Collections.reverse(ar);
		System.out.println(ar);//[98, 87, 67, 56, 23]
		
		//collections.swap(ar,index1, index2) helps in swaping the element;
		Collections.swap(ar,0,1);
		System.out.println(ar);//[87, 98, 67, 56, 23]
		
		//Collections.fequency()// Counts occurrence of an element.
		System.out.println(Collections.frequency(ar,98));//2
		
		Collections.addAll(ar,75,45,35,823);
		System.out.println(ar);//[98, 98, 87, 67, 56, 23, 75, 45, 35, 823]
		
		//Collections.disJoints(collection1, collection2); checks two collection does not have common elements.
		
		System.out.println(Collections.disjoint(ar,s));//

		
		
		
		
		
		

		

		
		

		
		
		
		
		

	}

}
