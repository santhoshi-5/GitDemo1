import java.util.*;
class ArraysDemo2
{
	public static void main(String[] args)
	{
		HashSet<String> hs = new HashSet<>();
		hs.add("aaa");
		hs.add("bbb");
		hs.add("ccc");
		hs.add("ddd");
		hs.add("abc");
		
		Object[] a = hs.toArray();
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}