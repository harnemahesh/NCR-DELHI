package Logical_Programed;

public class Armstrong 
{

	public static void main(String[] args) {
		
		int org=153;
		
		int Sum=0;
		
		for(int i=org;  i>0; i=i/10)
		{
			int rem=i%10;
			Sum=Sum+(rem*rem*rem);
		}
		if(org==Sum)
		{
			System.out.println("Given number is armstrong Number");
		}
		else
		{
			System.out.println("Given number is not armStrong Number");
		}
		
	}	
	
	
}
