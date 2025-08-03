import java.util.*;
class MyComp implements Comparator<String>
{
    public int compare(String a1,String a2)
    {
        return a1.compareTo(a2);
    }
}
public class Ascending1
{
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>(new MyComp());
		t.add("C");
		t.add("A");
		t.add("B");
		t.add("E");
		t.add("F");
		t.add("D");
		for(String e : t)
		    System.out.print(e+" ");
		System.out.println();
		System.out.println("Traversing using Iterator");
		Iterator itr = t.iterator();
		while(itr.hasNext())
	    {
	        System.out.print(itr.next()+" ");
	    }
	    System.out.println();
	}
}