import java.util.*;
public class LinkedHashSetDemo
{
	public static void main(String[] args) 
	{
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.add("C");
		hs.add("A");
		hs.add("E");
		hs.add("B");
		hs.add("D");
		hs.add("F");
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
		    System.out.print(itr.next()+" ");
		System.out.println();
		hs.remove("B");
		for(String ele: hs)
		    System.out.print(ele+" ");
		System.out.println();
	}
}