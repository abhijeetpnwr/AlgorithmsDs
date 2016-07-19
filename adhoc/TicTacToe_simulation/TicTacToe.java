package com.uva.adhoc;

public class TicTacToe 
{
	public static void main(String args[]) 
	{
		String firstline = "X . O";
		String secondline = "O O .";
		String thirdline = "X X X";
		
		String[] strarr = new String[3]; 
		
		strarr[0]=firstline;strarr[1]=secondline;strarr[2]=thirdline;
		
		String[][] movearr = new String[3][3]; 
		
		int rowcount = 0;
		
		for(String st: strarr)
		{
			int colcount = 0;
			for(String ch : st.split("\\s+"))
			{
				movearr[rowcount][colcount] = ch;
				colcount++;
			}
			rowcount++;
		}
		
		drawBoard(movearr);
		
		if(validateBoard(movearr)==true)
		{
			System.out.println("Valid Board Yet");
		}
		else
		{
			System.out.println("Not a valid board");
		}
		
	}
	
	public static void drawBoard(String[][] movearr)
	{
		System.out.println(" -- Drawing Game Board On Conole --- \n");
		
		for (int row=0; row < movearr.length; row++)
		{
		    for (int col=0; col < movearr[row].length; col++)
		    {
		        String value = movearr[row][col];
		        
		        System.out.print(value+" ");
		    }
		    System.out.println();
		}
	}
	
	public static boolean validateBoard(String[][] movearr)
	{
		
		System.out.println(" \n -- Need to validate Game Board -- \n ");
		
		Boolean validateBool = true;
		
		int X_count = 0 , O_count = 0;
		
		 /* Condtion for validity , Possibilities of X and O , 
				1.no(X) == no(O) or 2. no(x) >no(1); 
		*/
		
		for (int row=0; row < movearr.length; row++)
		{
		    for (int col=0; col < movearr[row].length; col++)
		    {
		        String value = movearr[row][col];
		        
		        if(value.equals("X"))
		        {
		        	 X_count++;	
		        }
		        
		        if(value.equals("O"))
		        {
		        	   O_count++;
		        }
		        
		     
		    }
	
		}
		
		System.out.println("Total X:"+X_count+"Total O :"+O_count);
		
		if(O_count>X_count)
		{
			validateBool = false;
		}
		
		
		return validateBool;
	}
	
}
