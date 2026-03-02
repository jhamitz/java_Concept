package Strings;


class RemoveOcurrance
{
	String res = "";
	public String remove(String s)
	{
		
		for(int i = 0 ; i<s.length();i++)
		{
			if(s.charAt(i)!='e')
			{
				res = res+s.charAt(i);
			}
			
		}
		return res;
	}
}

public class RemoveAllSimalrOccuranceOfChar {
	public static void main (String arg[])
	{
	RemoveOcurrance rv = new RemoveOcurrance();
		System.out.println(rv.remove("geeksforgeeks"));
	}
}
