package Strings;

/*class InserCh
{
	String res = "";
	String val ="l";

	public String addingChar(String str,int pos)
	{
		for(int i = 0 ; i<str.length();i++)
			
		{
			if(pos == i)
			{
			res = res+val;//mital
			}
			 res = res+str.charAt(i);//mitaly
			 
		}
		return res;
	
}
}
public class InsertChar
{
	public static void main(String args[])
	{
		InserCh ins = new InserCh();
		System.out.println(ins.addingChar("Mitay",4));	
	
	}

}*/

//String builder
public class InsertChar
{
	public static void main(String args[])
	{
		StringBuilder st = new StringBuilder("Mitay");
		
		System.out.println(st.insert(4,'l'));
		
		
	
	}

}




