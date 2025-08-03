import java.util.*;
import java.io.*;
interface DDictionary<K extends Comparable<K>,V>
{
	boolean isEmpty();
	int size();
	void insert(Pair<K,V> p);
	Pair<K,V> find(K key);
	void delete(K key);
}
class Pair<K extends Comparable<K>,V>
{
	K key;
	V value;
	Pair(K key,V value)
	{
		this.key = key;
		this.value = value;
	}
	public String toString()
	{
		return "Key: "+key+" Value: "+value;
	}
}
class TreeNode<K extends Comparable<K>,V>
{
	Pair<K,V> data;
	TreeNode<K,V> lchild;
	TreeNode<K,V> rchild;
	TreeNode(Pair<K,V> d,TreeNode<K,V> l,TreeNode<K,V> r)
	{
		data=d;
		lchild=l;
		rchild=r;
	}
	
}
class BTSDictionary<K extends Comparable<K>,V>
{
	TreeNode<K,V> root;
	int dsize;
	BTSDictionary()
	{
		root=null;
		dsize=0;
	}
	boolean isEmpty()
	{
		return root==null;
	}
	int size()
	{
		return dsize;
	}
	void insert(Pair<K,V> p)
	{
		TreeNode<K,V> nn = new TreeNode<K,V>(p,null,null);
		TreeNode<K,V> parent=null;
		TreeNode<K,V> child;
		if(root==null)
			root = nn;
		else
		{
			child=root;
			while(child!=null)
			{
				parent=child;
				if(p.key.compareTo(child.data.key)>0)
					child = child.rchild;
				else
					child = child.lchild;
			}
			if(p.key.compareTo(parent.data.key)>0)
				parent.rchild = nn;
			else
				parent.lchild=nn;
		}
		dsize++;
	}
	void display()
	{
		if(isEmpty())
		{
			System.out.println("Tree is empty");
			return;
		}
		else
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the traversal choice");
			System.out.println("1.Inorder\n2.Preorder\n3.Postorder");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1: inorder(root);
					break;
				case 2: preorder(root);
					break;
				case 3: postorder(root);
					break;
			}
		}
	}
	void inorder(TreeNode<K,V> root)
	{
		if(root!=null)
		{
			inorder(root.lchild);
			System.out.println(root.data);
			inorder(root.rchild);
		}
	}
	void preorder(TreeNode<K,V> root)
	{
		if(root!=null)
		{
			System.out.println(root.data);
			preorder(root.lchild);
			preorder(root.rchild);
		}
	}
	void postorder(TreeNode<K,V> root)
	{
		if(root!=null)
		{
			postorder(root.lchild);
			postorder(root.rchild);
			System.out.println(root.data);
		}
	}
	Pair<K,V> find(K key)
	{
		TreeNode<K,V> temp = root;
		while(temp!=null && !(key.equals(temp.data.key)))
		{
			if(key.compareTo(temp.data.key)>0)
				temp=temp.rchild;
			else
				temp=temp.lchild;
		}
		if(temp==null)
			return null;
		else
			return temp.data;
	}
	void delete(K key)
	{
		TreeNode<K,V> parent=null;
		TreeNode<K,V> child;
		TreeNode<K,V> ps,s;
		if(isEmpty())
		{
			System.out.println("Tree is empty");
			return;
		}
		else
		{
			child=root;
			while(child!=null && !(key.equals(child.data.key)))
			{	
				parent=child;
				if(key.compareTo(child.data.key)>0)
					child = child.rchild;
				else
					child = child.lchild;
			}
			if(child==null)
			{
				System.out.println("Entry not found");
				return;
			}
			if(child.lchild!=null && child.rchild!=null)
			{
				ps=child;
				s=child.lchild;
				while(s.rchild!=null)
				{
					ps=s;
					s=s.rchild;
				}
				child.data = s.data;
				child=s;
				parent = ps;
			}
			TreeNode<K,V> c;
			if(child.lchild==null)
				c = child.rchild;
			else
				c = child.lchild;
			if(child==root)
				root=c;
			else
			{
				if(child==parent.rchild)
					parent.rchild = c;
				else
					parent.lchild = c;
			}
			System.out.println("Key "+key+" is deleted");
		}
	}
}
class BTSMain
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ch;
		Integer key;
		String value;
		Pair<Integer,String> p;
		BTSDictionary<Integer,String> bts = new BTSDictionary<>();
		System.out.println("Dictionary of type Integer and String");
		do
		{
			System.out.println("BTS Dictionary Operations");
			System.out.println("1.Insert");
			System.out.println("2.Delete");
			System.out.println("3.Find");
			System.out.println("4.Display");
			System.out.println("5.Exit");
			System.out.println("Enter choice");
			ch = Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1: System.out.println("Enter key");
					key = Integer.parseInt(br.readLine());
					System.out.println("Enter value");
					value = br.readLine();
					p = new Pair(key,value);
					bts.insert(p);
					break;
				case 2: System.out.println("Enter key to be deleted");
					key = Integer.parseInt(br.readLine());
					bts.delete(key);
					break;
				case 3: System.out.println("Enter the key to be searched");
					key = Integer.parseInt(br.readLine());
					Pair<Integer,String> ts = bts.find(key);
					if(ts==null)
						System.out.println("Key "+key+" searched is not found");
					else
						System.out.println("Key "+ts.key+" searched is found with value :"+ts.value);
					break;
				case 4: bts.display();
					break;
				case 5: break;
			}
		}while(ch<5);
	}
}