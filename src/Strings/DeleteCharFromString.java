package Strings;

/*public class DeleteCharFromString {
	public static void main(String args[])
	{
		String s = "Mitaly";
		int pos = 1;
		String res ="";
		for(int i = 0 ; i<s.length(); i++)
		{
			if(i!=pos)
				{
				res = res+s.charAt(i);
					
				}
			
		}
		System.out.println(res);
	}

}*/
 //using methods
/*class RemoveCharStr
{
	public String deleteChar(String strng,int p,String res)
	{
		for(int i =0 ; i<strng.length();i++)
		{
			if(i!=p)
			{
				res = res+strng.charAt(i);
			}
			
		}
		return res;
		
	}
}
public class DeleteCharFromString 
{
	public static void main(String args[])
	{
		RemoveCharStr dlt = new RemoveCharStr();
		String fun = dlt.deleteChar("Gourav",2,"");
		System.out.println(fun);
		
	}
}*/

//Stringbuilders

public class DeleteCharFromString 
{
	public static void main(String args[])
	{
		StringBuilder s  = new StringBuilder("Gaurav");
		System.out.println(s.deleteCharAt(1));
		
	}
}


