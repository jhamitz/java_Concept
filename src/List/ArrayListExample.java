

package List;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String args[])
	{
		ArrayList <String> alist = new ArrayList<String>();//Syntax ArrayList<datatype> a = new ArrayList<datatype>
		alist.add("Mitaly");//.add("String")->returns string,adds elements at the end
		alist.add("Mala");
		alist.add("Tanu");
		alist.add("Rosy");
		alist.add("Ayush");
		alist.add("Tanu");
		alist.add("Rosy");
		alist.add("HTML");
		
		System.out.println(alist);//o/p->[Mitaly, Mala, Tanu, Rosy, Ayush]
		
		alist.add(0,"Gourav");//.add(index,string)->returns string, add string at specific index 
		System.out.println(alist);// o/p [Gourav, Mitaly, Mala, Tanu, Rosy, Ayush].
		
		alist.get(0);// takes index value return value based on index //o/p gourav
		System.out.println(alist.get(0));//o/p :Gourav;
		
		alist.set(1, "Mirav");//alist.set(index,string); used to existing String to replace string at specific index.
		System.out.println(alist);//[Gourav, Mirav, Mala, Tanu, Rosy, Ayush]
		
		alist.remove(1);// alist.remove(intiger)-- used to remove specific element.//o/p: mala.
		System.out.println(alist);//
		
		
		alist.size();//returns size of array
		System.out.println(alist.size());//5
		
		alist.contains("Java");//returns boolean value,check elements.
		System.out.println(alist.contains("Java"));//false
		System.out.println(alist.contains("Mala"));//true.
		
		
		/*alist.clear();
		System.out.println(alist);//o/p - []
		
		alist.isEmpty();
		System.out.println(alist.isEmpty());//return boolean value if empty return true else false*/
		
		alist.indexOf("Tanu"); // accepts string and return intiger of specific element
		System.out.println(alist.indexOf("Tanu"));//2
		
		alist.lastIndexOf("Tanu"); // accepts string and return intiger of last element
		System.out.println(alist.lastIndexOf("Tanu"));//5
		
		
		ArrayList<String>list2 = new ArrayList<String>();
		 list2.add("HTML");
		 System.out.println(list2);
		 
		 //Adding all the string of list2 to alist by using addAll();
		 
		 alist.addAll(list2);
		 System.out.println(alist);//[Gourav, Mala, Tanu, Rosy, Ayush, Tanu, HTML]
		 
		// remove common one retainAll();
		 
		 alist.retainAll(list2);
		 System.out.println(alist);
		 
		 /*alist.removeAll(list2);
		 System.out.println(alist);*/
		 
		 
		 
		
		
		
		

		
		
		
		

		
		
		
		
		


		
	}

}
