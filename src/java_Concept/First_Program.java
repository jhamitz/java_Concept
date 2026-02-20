package java_Concept;



class pro
 {
	  void fun()
	 {
		 System.out.println("Gola");
	 }
	 void fun2()
	 {
		 System.out.println("pukku");
	 }
	static void fun3()
	 {
		 System.out.println("chikky");
	 }
 }
public class First_Program  {
	
	
		  void  fun()
		 {
			 System.out.println("Enteree");
		 }
		  void fun2()
		 {
			 System.out.println("Printerrrrrr"); 
		 }
		 static  void fun3()
		 {
			 System.out.println("Grinder");
		 }
		 public static void main(String args[])
		 {
			 pro.fun3();//class.method with static keyword
			 First_Program.fun3();//class.method wih static keyword
			 
			 pro p = new pro();// if in the class body method is not static then we have to create an object of non static
			 p.fun2();
			 
			 First_Program t = new First_Program();
			 t.fun2();
			 
		 }
		 

}

