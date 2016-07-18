import java.util.Scanner;

public class three_n_1_problem {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int number = 22;
		
		int cycleno=1;
		
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		
		int end = sc.nextInt();
		
		int maxcycles = 1;
		
		for(int i =start ; i<=end;i++)
		{
		cycleno = 1 ;
			number = i;
			
		while(number != 1)
		{		
			cycleno++;
			
		   if(number%2!=0)
		   {
			     number = (number*3)+1;
		   }	   
		   else
		   {
			   number = number/2;
		   }
		}
		if(maxcycles<cycleno)
		{
		   maxcycles = cycleno;	
		}
		
		}
		System.out.println(start+" "+end+" "+maxcycles);
	}
}
