package Arrays;


public class Max_Num_Array {
	
	public static void main(String args[])
	{
		
		int d[][] = {{16,14,17},{9,18,11},{12,9,30}};
			int max = d[0][0];
			for(int i = 0 ; i<d.length; i++)
			{
				for(int j = 0 ; j<d[i].length;j++)
				{
					if(max<d[i][j]) 
					{
						max = d[i][j];
					}
				}
			}
		System.out.println("Max::"+max);
	}

}
