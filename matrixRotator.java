/*
 * 
        static int [][] charMatrix = new int[][]{ {1,2,3,4},
		{5,6,7,8},
		{9,10,11,12},
		{13,14,15,16}	
	}; 
 */


public class matrixRotator 
{
  public void rotateMatrix(int[][] Matrix)
  {
	  int[][] rotatedMatrix = new int[4][4]; 
	  
	  drawMatrix(Matrix);
	  
	  System.out.println("We need to rotate this matrix now : ");
	  
	  for(int rowindex = 3; rowindex>=0 ; rowindex--)
	  {
		  for(int colindex = 0;colindex<=3;colindex++)
		  {
			 rotatedMatrix[colindex][3-rowindex]=Matrix[rowindex][colindex]; 		  
		  }
		  System.out.println("\n ");
	  }
	  
	  drawMatrix(rotatedMatrix);
	  
  }
  
  public void drawMatrix(int[][] charMatrix)
  {
	  System.out.println(" -- Matrix draw --- \n");
	  
	  for(int[] matRow : charMatrix)
	  {
		  
		  for(int elem:matRow)
		  {
			  System.out.print(elem+"\t");
		  }
		  System.out.println("\n");
	  }
  }
}


