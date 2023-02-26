package Logical_Programed;

public class Pallendrum
{

	public static void main(String[]args)
	{
		String arg="madam";
		String sum="";
		
		for(int i=arg.length()-1;  i>=0; i--)
		{
			sum=sum+arg.charAt(i);
		}
		if(arg.equals(sum))
		{
			System.out.println("Given String is pallendrum");
		}
		else
		{
			System.out.println("Given String is Not Pallendrum"); 
		}
	
	}
}
