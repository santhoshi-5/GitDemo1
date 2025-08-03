import java.util.*;
import java.io.*;
class SeperateChaining<K extends Comparable<K>,V>
{
	private int n;
	private int m;
	private Node<K,V>[] table;
	private class Node<K,V>
	{
		private K key;
		private V value;
		private Node<K,V> next;
		public Node(){ }
		public Node(K key,V value,Node next)
		{
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}
	public SeperateChaining(int capacity)
	{
		n = 0;
		m = capacity;
		table = new Node[m];
		for(int i=0;i<m;i++)
			table[i] = null;
	}
	public int size()
	{
		return n;
	}
	public boolean isEmpty()
	{
		for(int i=0;i<m;i++)
			if(table[i]!=null)
				return false;
		return true;
	}
	public void insert(K key,V value)
	{
		int home = hash(key);
		Node<K,V> npnode = new Node<>(key,value,null);
		Node<K,V> temp = table[home];
		
		if(table[home]==null)
		{
			table[home] = npnode;
		}
		else
		{
			while(temp.next!=null)
				temp = temp.next;
			temp.next = npnode;
		}
		n++;
	}
	public V delete(K key)
	{
		if(isEmpty())
		{
			System.out.println("Hash Table is Empty");
			return null;
		}
		int home = hash(key);
		Node<K,V> temp = table[home];
		Node<K,V> prev = null;
		while(temp!=null && temp.key.compareTo(key)!=0)
		{
			prev = temp;
			temp = temp.next;
		}
		if(temp!=null)
		{
			if(temp==table[home])
				table[home] = temp.next;
			else
				prev.next = temp.next;
			return temp.value;
		}
		System.out.println("Given data is not present in the Hash table");
		return null;
	}
	public void search(K key)
	{
		int home = hash(key);
		Node<K,V> temp = table[home];
		while(temp!=null && !key.equals(temp.key))
		{
			temp = temp.next;
		}
		if(temp!=null)
			System.out.println("Key: "+temp.key+"  Value: "+temp.value);
		else
			System.out.println("Search element not found in hash table");
	}
	public void display()
	{
		Node<K,V> temp;
		for(int i=0;i<m;i++)
		{
			System.out.println("Data at index "+i+" in Hash table:");
			System.out.println("Key           Value");
			System.out.println("-------------------");
			temp = table[i];
			while(temp!=null)
			{
				System.out.println(temp.key+"\t"+temp.value);
				temp = temp.next;
			}
		}
	}
	private int hash(K key)
	{
		return key.hashCode()%m;
	}
}
class SeperateChainingMain
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of Hash table");
		int n = Integer.parseInt(br.readLine());
		int choice=0;
		SeperateChaining<Integer,String> sc = new SeperateChaining<>(n);
		System.out.println("Data is in the form Integer and String");
		int key;
		String value;
		do
		{
			System.out.println("1.Insert");
			System.out.println("2.Delete");
			System.out.println("3.Search");
			System.out.println("4.Display");
			System.out.println("5.Exit");
			System.out.println("Enter choice");
			choice = Integer.parseInt(br.readLine());
			switch(choice)
			{
				case 1: System.out.println("Enter the key:");
					key = Integer.parseInt(br.readLine());
					System.out.println("Enter value:");
					value = br.readLine();
					sc.insert(key,value);
					break;
				case 2: System.out.println("Enter the key to be deleted");
					key = Integer.parseInt(br.readLine());
					value = sc.delete(key);
					if(value!=null)
						System.out.println("Key "+key+" is deleted with value "+value);
					break;
				case 3: System.out.println("Enter the key to be searched");
					key = Integer.parseInt(br.readLine());
					sc.search(key);
					break;
				case 4: sc.display();
					break;
				case 5: break;
			}
		}while(choice<5);
	}
}