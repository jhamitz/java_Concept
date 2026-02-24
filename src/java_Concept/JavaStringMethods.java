package java_Concept;

public class JavaStringMethods {
	public static void main(String args[])
	{
		//length(): returns number of characters
		String s = "Rakshita";
		System.out.println(s.length());
		
		//charAt(Index):returns character of the index
		String a = "Mirav";
		System.out.println(a.charAt(2));//2
		
		//tocharArray(): convert String to char array
		
		String n = "Tanupriyajha";
		System.out.println(n.toCharArray());
		
		//.equals: compare the contents(case sensitive),returns boolean value
		String c = "java";
		String d = "java";
		System.out.println(c.equals(d));//true;
		
		//.equalsIgnoreCase(): compare the contents(case sensitive),returns boolean value
		String s1 = "java";
		String s2 = "Java";
		System.out.println(c.equalsIgnoreCase(d));//true;
		
		//compareTo: Dictionary compare..check ASCII value
		 String h1 = "apple";
		 String h2 ="banana";
		System.out.println(h1.compareTo(h2));//-1
		
		//Searching methods
		//contains(""):checks substring present or not ,returns true false
		String h3 = "My name is Mitaly";
		System.out.println(h3.contains("name"));//true
		
	// indexOf():First position of character/string, returns number;
		String h4 = "bannana";
		System.out.println(h4.indexOf("n"));//2
		
	//lastIndexOf(): last postion of char or string
		String h5 = "bannana";
		System.out.println(h5.lastIndexOf("a"));//2
		
	//case conversation Methods
		
	//	toUpperCase(): covert the method into upper or lower case
		
		String h6 = "bannana";
		System.out.println(h6.toUpperCase());//BANNANA
	//	toLowerCase(): covert the method into upper or lower case
		String h7 = "BANNANA";
		System.out.println(h6.toLowerCase());//bannana
		
	//Substring Methods
		//substring(start): including start index
		
		String name = "My name is Mitaly";
		String name1 = name.substring(1);
		System.out.println(name1);//y name is Mitaly
		
		//Substring Methods
				//substring(start,end): including start index,  exclude last index	
		String name2 = "My name is Mitaly";
		String name3 = name.substring(1,9);
		System.out.println(name3);//y name i

	//Trim & Remove Spaces
		//trim(): removes spaces from staert and end;
		//strip(): java11, same work as trim;
		
		String name5 = " hello mitaly ";
		System.out.println(name5.trim());//
		System.out.println(name5.strip());//
		
		//split(): breaks string into array
		
			String ss1 = "a,b,c";
			String ss2 [] = ss1.split(",");
			for(String nn1 : ss2)
			{
				System.out.println(nn1);//abc
			}
		//Split by multiple spaces (regex)
			String s12 = "my  name is Mitaly   jha";
			String s13 [] = s12.split("\\s+");
			for(String nn2 : s13)
			{
				System.out.print(nn2);
			}
			
		//Split by multiple spaces (regex)	
			String r = "my.name.is.Mitaly.jha";
			String r1 [] = r.split("\\.+");
			for(String nn2 : r1)
			{
				System.out.println(nn2);
			}
			
			//Split by multiple spaces (regex)	
			String r2 = "my*name*is*Mitaly*jha";
			String r3 [] = r2.split("\\*+");
			for(String nn3 : r3)
			{
				System.out.print(nn3);
			}
			System.out.println("");
			
			
			//Join strings
			
			String j = String.join("--","Mitaly jha");
			System.out.println(j);
			 
			
			
			
		
	
		
		
		

		

				
		
		
		
		
		
		
	}

}
