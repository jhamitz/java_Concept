package java_Concept;

import java.util.Arrays;

public class Anagram {
	public static void main(String args[])
	{
		String a ="Listen";
		String b = "SSilent";
		
		//convert both string int lowercase
		
		a = a.toLowerCase();
		b= b.toLowerCase();
		//condition
		if(a.length() != b.length())
		{
			System.out.println("not an Anagram");
			return;
		}
		
		//System.out.println(a);
		// converting string to character array
		char arr1 [] = a.toCharArray();
		char arr2 [] = b.toCharArray();
		
		//array sorting
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);
		 if(Arrays.equals(arr1, arr2))
		 {
			 System.out.println("an Anagram");
		 }
		
		 else
		 {
			 System.out.println("not an Anagram");
		 }
		
		
	}

}
