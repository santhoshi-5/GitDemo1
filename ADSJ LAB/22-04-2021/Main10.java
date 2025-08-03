import java.util.*;
class Item {
	String nm;
	int price;
	public Item(int n,String nm){
		this.nm=nm;
		price=n;
	}
	public String toString(){
		return "\nPrice "+price+" Name : "+nm;
	}
	
}
public class Main10{
	public static void main(String[] args){
		Item i1=new Item(1,"aa");
		Item i2=new Item(2,"ab");
		Item i3=new Item(32,"yx");
		Item i4=new Item(14,"xy");
		ArrayList<Item> a1=new ArrayList<>();
		a1.add(i1);
		a1.add(i2);
		a1.add(i3);
		a1.add(i4);
		System.out.println("Array List Sorted by name:");
		Collections.sort(a1,new NameComparator());
		System.out.println(a1);
		System.out.println("Array List Sorted by price:");
		Collections.sort(a1,new PriceComparator());
		System.out.println(a1);
	}
}
class PriceComparator implements Comparator<Item>{
	public int compare(Item i1,Item i2){
		if(i1.price==i2.price)
			return 0;
		else if(i1.price>i2.price)
			return 1;
		else
			return -1;
	}
}
class NameComparator implements Comparator<Item>{
	public int compare(Item i1,Item i2){
		return i1.nm.compareTo(i2.nm);
	}
}