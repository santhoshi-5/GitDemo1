import java.util.*;
   
class MyComp implements Comparator<Integer> {

    public int compare(Integer a, Integer b)
    {
        return b.compareTo(a);
    }
}
   
public class TreeMapComparatorDemo {
    public static void main(String[] args)
    {
        TreeMap<Integer,String> t= new TreeMap<Integer,String>(new MyComp());
   
        t.put(1,"z");
        t.put(13,"b");
        t.put(53,"c");
        t.put(9,"a");
            System.out.print(t + " ");
    }
}