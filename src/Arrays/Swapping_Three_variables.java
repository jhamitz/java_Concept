package Arrays;


public class Swapping_Three_variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//without temp
		
		int a = 8 ;
		int b = 7;
		int c = 5;
		
		a = a+b+c;//20
		b= a-(b+c);//20-12=8
		c = a-(b+c); //7
		a = a-(b+c);//5
		
		
		
		 
		 
		 System.out.println("show the value of a:"+ a);
			System.out.println("show the value of b:"+ b);
			System.out.println("show the value of c:"+ c);
			
			//with temp variable
			
			int d = 8 ;
			int e = 7;
			int f = 5;
			int temp;
			temp = d;
			d=e;
			e =f;
			f=temp;
			 
			System.out.println("show the value of d:"+ d);
			 System.out.println("show the value of e:"+ e);
				System.out.println("show the value of f:"+ f);
				
			
			
		

	}

}
