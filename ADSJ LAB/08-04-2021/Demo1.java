import java.util.*;
public class Demo1
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		TreeSet<Integer> ts = new TreeSet<Integer>();
		System.out.println("Enter the number of integers");
		int n = sc.nextInt();
		System.out.println("Enter integers");
		for(int i=0;i<n;i++)
		{
		    ts.add(sc.nextInt());
		}
		System.out.println("Enter the element");
		Integer ele = sc.nextInt();
		try
		{
		    if(ts.floor(ele) <= ele)
		        System.out.println("Element less than or equal to "+ele+" is "+ts.floor(ele));
		}
		catch(Exception e)
		{
		    System.out.println(ele+" is the only element");
		}
	}
}