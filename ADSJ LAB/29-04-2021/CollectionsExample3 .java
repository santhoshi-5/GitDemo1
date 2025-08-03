import java.util.*;
public class CollectionsExample3 
{
	public static coid main(String a[])
	{
		List<Integer> list=new ArrayList<Integer>();
		list.add(46);
		list.add(67);
		list.add(24);
		list.add(16);
		list.add(8);
		list.add(12);
		System.out.println("maximum element"+Collections.max(list));
		System.out.println("minimum element: "+Collections.min(list));
		
		Collections.sort(al);
		Iterator itr=al.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
	}
}

		
