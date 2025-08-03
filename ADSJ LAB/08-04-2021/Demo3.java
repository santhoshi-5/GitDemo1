import java.util.*;
public class Demo3
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		TreeSet<String> ts = new TreeSet<String>();
		System.out.println("Enter the number of fruits");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter fruits");
		for(int i=0;i<n;i++)
		{
		    ts.add(sc.nextLine());
		}
		System.out.println("Contents of ts using descending iterator:");
		Iterator itr = ts.descendingIterator();
		while(itr.hasNext())
		    System.out.print(itr.next()+" ");
		System.out.println();
	}
}