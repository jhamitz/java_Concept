package Strings;

public class SearchChFromString {
	
	public static void main(String args[])
	{
		//first occurance of k
	
		String s ="GeeksforGeeks";
		char ch ='k';
		for(int i=0 ; i<s.length();i++)
		{
			if(s.charAt(i) == ch)
			{
				System.out.println("first occurance of k:"+i);
				
				break;
			}
		}
		
		
	}

}
