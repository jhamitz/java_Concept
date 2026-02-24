package java_Concept;
// 3. Count vowels, consonants, digits, spaces
public class Countvowelsconsonantsdigitsspaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String s = "Test123 Java";
	    char[] chArr = s.toCharArray();
	    
	    int vow = 0;//3
	    int cons = 0;//
	    int digit = 0;
	    int space = 0;
	    
	    for(char show : chArr)
	    {
	    	if("AEIOUaeiou".indexOf(show)>=0)
			{
				vow++;
				
			}
	    	else if(Character.isDigit(show))
	    	{
	    		digit++;
	    	}
	    	else if(Character.isLetter(show))
	    	{
	    		cons++;
	    	}
	    	else if(Character.isWhitespace(show))
	    	{
	    		space++;
	    	}
	    }
	    System.out.println("vowel"+" "+ vow);
	    System.out.println("digit"+" "+ digit);

	    System.out.println("constant"+" " +cons);

	    System.out.println("spaces"+" "+ space);

	    
	    
	    

	}

}
