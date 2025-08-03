import java.util.*;
class Item
{
    String name;
    int price;
    Item(String n,int i)
    {
        name = n;
        price = i;
    }
    public String toString()
    {
        return "Name: "+name+" Price: "+price+"\n";
    }
}

public class Itemobjects
{
	public static void main(String[] args) 
	{
	    Item i1 = new Item("aa",1);
	    Item i2 = new Item("bb",5);
	    Item i3 = new Item("dd",10);
	    Item i4 = new Item("xx",41);
	    Item i5 = new Item("x5",3);
	    HashSet<Item> t = new HashSet<>();
	    t.add(i1);
	    t.add(i2);
	    t.add(i3);
	    t.add(i4);
	    t.add(i5);
	    System.out.println(t);
	}
}