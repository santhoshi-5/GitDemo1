import java.util.*;
import java.io.*;
class KeyValue<T>
{
	T key;
	String name;
	int age;
	public KeyValue(){ }
	public KeyValue(T key,String name,int age)
	{
		this.key=key;
		this.name=name;
		this.age=age;
	}
}
class LinearProbing<T>
{
	private int currentsize;
	int maxsize;
	KeyValue<T>[] keyvalue;
	boolean[] bit;
	public LinearProbing(){ }
	public LinearProbing(int capacity)
	{
		currentsize = 0;
		maxsize = capacity;
		keyvalue = new KeyValue[maxsize];
		bit = new boolean[maxsize];
		for(int i=0;i<maxsize;i++)
		{
			keyvalue[i]=null;
			bit[i] = true;
		}
	}
	private int hash(T key)
	{
		return key.hashCode()%maxsize;
	}
	int probe(int home,T key)
	{
		int i = home;
		do
		{
			if(keyvalue[i]==null)
				return i;
			i = (i+1)%maxsize;
		}while(i!=home);
		return -1;
	}
	public boolean insert(T key,String name,int age)
	{
		int home = hash(key);
		int index = probe(home,key);
		if(index!=-1)
		{
			keyvalue[index] = new KeyValue(key,name,age);
			bit[index] = false;
			return true;
		}
		else
			return false;
	}
	public KeyValue search(T key)
	{
		int home = hash(key);
		int i = home;
		do
		{
			if(keyvalue[i]!=null && key.equals(keyvalue[i].key))
				return keyvalue[i];
			i = (i+1)%maxsize;
		}while(i!=home && !bit[i]);
		return null;
	}
	public boolean delete(T key)
	{
		int home = hash(key);
		int i = home;
		do
		{
			if(keyvalue[i]!=null && key.equals(keyvalue[i].key))
			{
				keyvalue[i] = null;
				return true;
			}
			i = (i+1)%maxsize;
		}while(!bit[i] && i!=home);
		return false;
	}
	public KeyValue[] getList()
	{
		return keyvalue;
	}
}
class LinearProbingMain
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the table size");
		int n = Integer.parseInt(br.readLine());
		System.out.println("Data type of Key is Integer");
		LinearProbing<Integer> lp = new LinearProbing<>(n);
		int ch;
		int age,key;
		String name;
		do
		{
			System.out.println("1.Insert");
			System.out.println("2.Delete");
			System.out.println("3.Search");
			System.out.println("4.Display");
			System.out.println("5.Exit");
			System.out.println("Enter choice");
			ch = Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1: System.out.println("Enter key");
					key = Integer.parseInt(br.readLine());
					System.out.println("Enter name");
					name = br.readLine();
					System.out.println("Enter age");
					age = Integer.parseInt(br.readLine());
					boolean b = lp.insert(key,name,age);
					if(!b)
						System.out.println("Can't insert, Hash table is full");
					else
						System.out.println("Insert successfull");
					break;
				case 2: System.out.println("Enter key to be deleted");
					key = Integer.parseInt(br.readLine());
					boolean bo = lp.delete(key);
					if(bo)
						System.out.println("Key "+key+" is deleted from  Hash table");
					else
						System.out.println("Key "+key+" is not found in Hash table");
					break;
				case 3: System.out.println("Enter the key to be searched");
					key = Integer.parseInt(br.readLine());
					KeyValue<Integer> k = lp.search(key);
					if(k!=null)
						System.out.println("Key: "+key+" Name: "+k.name+" Age: "+k.age);
					else
						System.out.println("Key: "+key+" is not found in Hash table");
					break;
				case 4: System.out.println("Index    Key        Name                Age");
					System.out.println("-----------------------------------------------");
					int j = 0;
					KeyValue<Integer> arr[] = lp.getList();
					while(j<n)
					{
						if(arr[j]!=null)
							System.out.println(j+"        "+arr[j].key+"          "+arr[j].name+"             "+arr[j].age);
						j++;
					}
					break;
				case 5: break;
			}
		}while(ch<5);
	}
}