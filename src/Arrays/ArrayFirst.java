//program to find smallest number among matrix

/*7 3 6
  4 9 2
//smallest will be 2*/


package Arrays;


public class ArrayFirst {
	public static void main(String args[])
	{
		
		
		int abc[][] = {{7,3,6},{4,9,2}};
		int reg = abc[0][0];
		
		for(int i = 0 ; i<2; i++)
		{
			for(int j=0 ; j<3 ; j++)
			{
				if(reg>abc[i][j]);
				{
					reg = abc[i][j];
				
				}
				
			}
		}
		System.out.println("Smallest one"+ reg);
		
		
	}

}
