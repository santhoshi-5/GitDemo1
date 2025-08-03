import java.util.*;
interface Queue<T>
{
	void enqueue(T x);
	T dequeue();
	T frontElement();
	T rearElement();
	boolean isQueueFull();
	boolean isQueueEmpty();
}
class ArrayListQueue<T> implements Queue<T>
{
	ArrayList<T> al;
	ArrayListQueue()
	{
		al=new ArrayList<T>();
	}
	public boolean isQueueFull()
	{
		return false;
	}
	public boolean isQueueEmpty()
	{
		return al.size()==0;
	}
	public void enqueue(T x)
	{
		al.add(x);
	}
	public T dequeue()
	{
		if(isQueueEmpty())
		{
			System.out.println("Queue is empty");
			return null;
		}
		else
		{
			T y;
			y=al.get(0);
			al.remove(0);
			return y;
		}
	}
	public T frontElement()
	{
		if(isQueueEmpty())
		{
			System.out.println("Queue is empty");
			return null;
		}
		else
			return al.get(0);
	}
	public T rearElement()
	{
		if(isQueueEmpty())
		{
			System.out.println("Queue is empty");
			return null;
		}
		else
			return al.get(al.size()-1);
	}
	void display()
	{
		if(isQueueEmpty())
			System.out.println("Queue is empty");
		else
		{
			for(int i=0;i<al.size();i++)
				System.out.println(al.get(i));
			System.out.println();
		}
	}
}
public class ALQueueMain
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		ArrayListQueue<Integer> li = new ArrayListQueue<Integer>();
		int ch;
		Integer ele;
		System.out.println("Integer Queue");
		do
		{
		    System.out.println("1.Enqueue");
		    System.out.println("2.Dequeue");
		    System.out.println("3.Front element");
		    System.out.println("4.Rear element");
		    System.out.println("5.Display");
		    System.out.println("6.Exit");
		    System.out.println("Enter choice");
		    ch = sc.nextInt();
		    switch(ch)
		    {
		        case 1: System.out.println("Enter element");
		                ele = sc.nextInt();
		                li.enqueue(ele);
		                li.display();
		                break;
		        case 2: ele = li.dequeue();
		                if(ele!=null)
		                    System.out.println("Dequeued element: "+ele);
		                li.display();
		                break;
		        case 3: ele = li.frontElement();
		                if(ele!=null)
		                       System.out.println("Front element: "+ele);
		                li.display();
		                break;
		        case 4: ele = li.rearElement();
		                if(ele!=null)
		                    System.out.println("Rear element: "+ele);
		                li.display();
		                break;
		        case 5: li.display();
		                break;
		        case 6: break;     
		    }
		}while(ch<6);
		
		System.out.println("Strings Queue");
		ArrayListQueue<String> ls = new ArrayListQueue<String>();
		String e;
		do
		{
		    System.out.println("1.Enqueue");
		    System.out.println("2.Dequeue");
		    System.out.println("3.Front element");
		    System.out.println("4.Rear element");
		    System.out.println("5.Display");
		    System.out.println("6.Exit");
		    System.out.println("Enter choice");
		    ch = sc.nextInt();
		    switch(ch)
		    {
		        case 1: System.out.println("Enter element");
		                e = sc.next();
		                sc.nextLine();
		                ls.enqueue(e);
		                ls.display();
		                break;
		        case 2: e = ls.dequeue();
		                if(e!=null)
		                    System.out.println("Dequeued element: "+e);
		                ls.display();
		                break;
		        case 3: e = ls.frontElement();
		                if(e!=null)
		                       System.out.println("Front element: "+e);
		                ls.display();
		                break;
		        case 4: e = ls.rearElement();
		                if(e!=null)
		                    System.out.println("Rear element: "+e);
		                ls.display();
		                break;
		        case 5: ls.display();
		                break;
		        case 6: break;     
		    }
		}while(ch<6);
	}
}


