import java.util.*;
class Swap<T>
{
    ArrayList<T> al;
    int x,y;
    Swap(ArrayList<T> a)
    {
        al=a;
    }
    void change(int x,int y)
    {
        T c,d;
        c = al.get(x);
        d = al.get(y);
        al.set(x,d);
        al.set(y,c);
    }
}
public class ElementInterchange
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		Swap<String> s = new Swap<String>(al);
		System.out.println("Contents of al before swap: "+al);
		System.out.println("Swaping positions 2,4");
		s.change(2,4);
		System.out.println("Contents of al after swap: "+al);
	}
}