import java.util.*;
class Item implements Comparable<Item>{
	String nm;
	int price;
	public Item(int n,String nm){
		this.nm=nm;
		price=n;
	}
	public String toString(){
		return "\nPrice "+price+" Name : "+nm;
	}
	public int compareTo(Item I2){
		return this.nm.compareTo(I2.nm);
	}
}
public class ArrayList8{
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
		Collections.sort(a1);
		System.out.println(a1);
	}
}