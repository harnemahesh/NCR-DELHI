package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class SET_Hashset 
{
	public static void main(String[] args)
	{
	
		HashSet hs=new HashSet();
		        hs.add("Mahesh");
		        hs.add(null);
		        hs.add("Uttareshwar");
		        hs.add("mayur");
		        hs.add(20.25);
		        hs.add(200);
		        hs.add('B');
		        
		        System.out.println(hs);
		    hs.remove(200);
		    System.out.println(hs);
		    
		     boolean H1=hs.isEmpty();
		    System.out.println(H1);
		
		boolean h=hs.contains("Mahesh");
		System.out.println(h);
		
		
		System.out.println(hs.size());
		
		System.out.println("+++++++++++for each loop+++++++++++");
	for(Object h1:hs)
	{
		System.out.println(h1);
	}
		
	System.out.println("------------------iterator=============");
	Iterator it=hs.iterator();
	
	while(it.hasNext())
	{
	System.out.println(it.next());	
	}
	
		
	}
	
}
