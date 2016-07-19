package com.uva.adhoc;

import java.util.Scanner;

public class Main
{
  public static void main(String args[])
  {
	  
	  Scanner sc = new Scanner(System.in);
	  
	  while(sc.hasNext())
	  {
		 ScrambleMethod(sc.nextLine());  
	  }
	  	 
  }
  
  public static void ScrambleMethod(String toScramble)
  {
	 
	  String Scrambled="";
	  
	  for(String word:toScramble.split("\\s+"))
	  {
		  
		   char[] chararr = word.toCharArray();
   
		   String reversstring = "";
		   
		   for(int index=chararr.length-1;index>=0;index--)
		   {  
			  reversstring = reversstring+chararr[index];  
		   }
		   
		   Scrambled=Scrambled+reversstring+" ";
	  }
	  
	  System.out.println(Scrambled.trim());
  }
  
}
