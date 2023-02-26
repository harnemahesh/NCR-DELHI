package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class triset123 
{
public static void main(String[] args) {
	

	TreeSet  t=new TreeSet();
	         t.add(20);
	         t.add(30);
	         t.add(35);
	         t.add(40);
	         t.add(50);
	         
	         System.out.println(t);
	         System.out.println(t.contains(30));
	         System.out.println(t.isEmpty());
	         System.out.println(t.size());
	         
	         t.pollFirst();
	         System.out.println(t);
	         
	         t.pollLast();
	         System.out.println(t); 
	         
	         System.out.println(t.first());
	         
	         System.out.println(t.last()); 
	         System.out.println("==========for each");
	         for(Object T1:t)
	         {
	        	 System.out.println(T1);
	         }
	         System.out.println("=========iterator=====");
	         Iterator it=t.iterator();
	         while(it.hasNext())
	         {
	        	 System.out.println(it.next());
	         }
}	
}
