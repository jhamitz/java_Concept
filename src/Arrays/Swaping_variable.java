package Arrays;


public class Swaping_variable {
	public static void main(String args[])
	{
		//without third variable
		int a = 18;
		int b = 12;
		
		a = a+b;//30
		b= a-b;//18
		a=a-b;//12
		System.out.println("show the value of a:"+ a);
		System.out.println("show the value of a:"+ b);
	
	//with third variable
	
		int c = 23;
		int d = 27;
		int temp;
		temp = c;
		c=d;
		d =temp;
		System.out.println("show the value of c:"+ c);
		System.out.println("show the value of d:"+ d);
				
	

}
}
