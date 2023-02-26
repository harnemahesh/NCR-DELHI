package Logical_Programed;

public class P2 
{
public static void main(String[] args) 
{

	int a=153;
	int res=0;
	for(int i=a;  i>0;  i=i/10)
	{
		int rem=i%10;
		res=res+(rem*rem*rem);
	}
	System.out.println(res);
	if(res==a)
	{
		System.out.println("given number is armstrong number");
	}
	else
	{
		System.out.println("Given no is not armstrong number");
	}
}
	
	
}
