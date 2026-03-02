package Strings;

public class Discussion {

	public static int addNumber(int a, int b) {
		
		return a+b;
		
	}
	
	public static String printName(String s) {
		
		return s;
	
	}
	public static  void  multiply(int a, int b) {
		
		
		System.out.println(a*b);
	}
	
	
	
	public static void main(String[] args) {

		int a=10;
		int b=20;
		
		multiply(a,b);
		
		//int reslut=addNumber(a,b);
		String str="Gourav";
		System.out.println(printName(str));
		
		System.out.println(addNumber(a,b));

	}

}
