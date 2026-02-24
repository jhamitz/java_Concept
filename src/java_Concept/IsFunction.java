package java_Concept;

public class IsFunction {
	//Isdigit-->checks character is number(0 to 9)
	public static void main(String args[])
	{
		char a = '9';
		
		char a2 = 'a';
		
		System.out.println(Character.isDigit(a));//true
		System.out.println(Character.isDigit(a2));//false
		
		//checks character is alphabet or not
		char b = '9';
		char b2 = 'a';
		char b3 = 'A';
		System.out.println(Character.isLetter(b));//false
		System.out.println(Character.isLetter(b2));//true
		System.out.println(Character.isLetter(b3));//true
		
		//is isWhitespace(): checks white space
		char c =' ';
		System.out.println(Character.isWhitespace(c));//true

		
		
		
		
		
	}

}
