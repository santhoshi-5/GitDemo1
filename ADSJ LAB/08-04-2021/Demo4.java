import java.util.*;
public class Demo4
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		TreeSet<String> ts = new TreeSet<String>();
		System.out.println("Enter the number of colous");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter colours");
		for(int i=0;i<n;i++)
		{
		    ts.add(sc.nextLine());
		}
		Iterator itr = ts.iterator();
		System.out.println("Contents of ts using descending iterator:");
		while(itr.hasNext())
		    System.out.print(itr.next()+" ");
		System.out.println();
		
		System.out.println("Size of tree: "+ts.size());
		System.out.println("First element of tree set: "+ts.first());
		System.out.println("Last element of tree set: "+ts.last());
		System.out.println("Enter element");
		String ele = sc.nextLine();
		int p=1;
		Iterator itr1 = ts.iterator();
		while(itr1.hasNext())
		{
		    if(ele.equals(itr1.next()))
		    {
		        System.out.println(ele+" exists");
		        p=0;
		        break;
		    }
		}
		if(p==1)
		    System.out.println(ele+" doesnot exists");
		
		System.out.println("Element just higher than "+ele+" is "+ts.higher(ele));
		System.out.println("Element just lower than "+ele+" is "+ts.lower(ele));
		
		
	}
}