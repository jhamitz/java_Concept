package Strings;

public class PalindromString {
	public static void main(String args[])
	{
		String s = "Madam";
		String pal = "";
		
		for(int i = s.length()-1 ; i>=0 ; i--)
		{
			pal = pal + s.charAt(i);		
			
		}
		System.out.println(pal);
		if(s.equalsIgnoreCase(pal))
		{
			System.out.println("its a palindrom");
		}
		else
		{
			System.out.println("its not a palindrom");
		}
	}

}
