import java.util.*;
public class HashSetDemo
{
	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<String>();
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
		hs.remove("C");
		for(String ele: hs)
		    System.out.print(ele+" ");
		System.out.println();
	}
}