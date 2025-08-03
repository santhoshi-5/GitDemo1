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
class PriceComparator implements Comparator<Item>
{
    public int compare(Item i1,Item i2)
    {
        if(i1.price==i2.price)
            return 0;
        else if(i1.price>i2.price)
            return 1;
        else 
        return -1;
    }
}
class NameComparator implements Comparator<Item>
{
    public int compare(Item i1,Item i2)
    {
        return i1.name.compareTo(i2.name);
    }
}
public class Ascending
{
	public static void main(String[] args) 
	{
	    Item i1 = new Item("aa",1);
	    Item i2 = new Item("bb",5);
	    Item i3 = new Item("dd",10);
	    Item i4 = new Item("xx",41);
	    Item i5 = new Item("x5",3);
	    TreeSet<Item> t = new TreeSet<>(new PriceComparator());
	    t.add(i1);
	    t.add(i2);
	    t.add(i3);
	    t.add(i4);
	    t.add(i5);
	    System.out.println(t);
	    TreeSet<Item> t2 = new TreeSet<>(new NameComparator());
	    t2.addAll(t);
	    System.out.println(t2);
	}
}