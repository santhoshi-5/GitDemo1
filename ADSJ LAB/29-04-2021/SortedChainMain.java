
import java.util.*;
import java.io.*;
interface DDictionary<K extends Comparable<K>,V>
{
	void insert(Pair<K,V> p);
	void delete(K key);
	Pair<K,V> find(K key);
	int size();
	boolean isEmpty();
	void display();
}
class Pair<K extends Comparable<K>,V>
{
	K key;
	V value;
	Pair(){ }
	Pair(K k,V v)
	{
		key=k;
		value=v;
	}
	public String toString()
	{
		return "Key: "+key+" Value: "+value+"\n";
	}
}
class PairNode<K extends Comparable<K>,V>
{
	Pair<K,V> data;
	PairNode<K,V> next;
	PairNode(Pair<K,V> p,PairNode<K,V> n)
	{
		data=p;
		next=n;
	}
}
class SortedChain<K extends Comparable<K>,V> implements DDictionary<K,V>
{
	PairNode<K,V> head=null;
	int dsize;
	public boolean isEmpty()
	{
		return head==null;
	}
	public int size()
	{
		return dsize;
	}
	public void insert(Pair<K,V> p)
	{
		PairNode<K,V> npNode = new PairNode<K,V>(p,null);
		if(isEmpty())
		{
			head=npNode;
		}
		else
		{
			if(p.key.compareTo(head.data.key)<0)
			{
				npNode.next = head;
				head = npNode;
			}
			else 
			{
				PairNode<K,V> temp,prev;
				temp = head;
				prev = null;
				while(temp!=null && (p.key.compareTo(temp.data.key)>0))
				{
					prev = temp;
					temp=temp.next;
				}
				npNode.next=prev.next;
				prev.next=npNode;
			}
		}
		dsize++;
	}
	public void display(){
    		PairNode<K,V> temp;
    		if(isEmpty()){
     			System.out.println("Dictionary is empty");
    		}
    		else{
      			temp=head;
      			while(temp!=null){
        			System.out.println(temp.data);
        			temp=temp.next;
			}
      		}
    	}
	public Pair<K,V> find(K key)
	{
		Pair<K,V> T=null;
		PairNode<K,V> temp=head;
		while(temp!=null && (key.compareTo(temp.data.key)>0))
		{
			temp=temp.next;
		}
		if(temp!=null)
			if(temp.data.key.equals(key))
				T=temp.data;
		return T;
	}
	public void delete(K key)
	{
		if(isEmpty())
		{
			System.out.println("Dictionary is empty");
		}
		else
		{
			PairNode<K,V> temp = head;
			PairNode<K,V> prev=null;
			while(temp!=null && (key.compareTo(temp.data.key)>0))
			{
				prev=temp;
				temp=temp.next;
			}
			if(temp.data.key.equals(key))
			{
				System.out.println("Deleted entry is: "+temp.data);
				if(temp==head)
				{
					head=head.next;
				}
				else
				{
					prev.next=temp.next;
				}
				dsize--;
			}
			else
				System.out.println("Element is not found");
		}
	}
}

class SortedChainMain
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception
	{
		int ch;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		SortedChain<String,Integer> sc = new SortedChain<String,Integer>();
		Pair<String,Integer> p;
		do
		{
			System.out.println("Sorted Chain Menu");
			System.out.println("1.Insert");
			System.out.println("2.Delete");
			System.out.println("3.Find");
			System.out.println("4.Size");
			System.out.println("5.Display");
			System.out.println("6.Exit");
			System.out.println("Enter choice:");
			ch = Integer.parseInt(br.readLine());
			if(ch==1)
			{
				System.out.println("Enter key and value to be inserted");
				String str = br.readLine();
				String s[] = str.split(" ");
				p = new Pair(s[0],Integer.parseInt(s[1]));
				sc.insert(p);
				//sc.display();
			}
			else if(ch==2)
			{
				System.out.println("Enter key to be deleted");
				String k = br.readLine();
				sc.delete(k);
				//sc.display();
			}
			else if(ch==3)
			{
				System.out.println("Enter key to be searched");
				String k = br.readLine();
				p = sc.find(k);
				if(p!=null)
				{
					System.out.println("Key "+p.key+" is found with value: "+p.value);
				}
				else
					System.out.println("Key searched is not found");
				//sc.display();
			}
			else if(ch==4)
			{
				System.out.println("Size of Sorted chain is: "+sc.size());
			}
			else if(ch==5)
			{
				System.out.println("Contents of sorted chain are:");
				sc.display();
			}
		}while(ch<=5);
	}
}