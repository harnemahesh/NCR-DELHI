package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset1 
{

	public static void main(String[] args) 
	{
LinkedHashSet hs=new LinkedHashSet();
			hs.add("Mahesh");
			hs.add(null);
			hs.add("Uttareshwar");
			hs.add("mayur");
			hs.add(20.25);
			hs.add(200);
			hs.add('B');
        
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains(20.25));
		System.out.println(hs.size());
		hs.remove(null);
		System.out.println(hs);
		
		System.out.println(hs.hashCode());
		System.out.println("======for each====");
		for(Object W:hs)
		{
			System.out.println(W);
		}
		System.out.println("====iterator====");
		Iterator it=hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
	}
	
	
	
}
