import java.util.*;
class Main5
{
    public static void main (String[] args) 
    {
        ArrayList<String> al = new ArrayList<String>();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        System.out.println("Original contents of al using iterator: ");
        Iterator<String> itr = al.iterator();
        while(itr.hasNext())
            System.out.print(itr.next()+" ");
        System.out.println();
        ListIterator<String> litr = al.listIterator();
        while(litr.hasNext())
        {
            String ele = litr.next();
            litr.set(ele+"+");
        }
        System.out.println("Modified elements of al: "+al);
        System.out.println("Modified list backwards");
        while(litr.hasPrevious())
            System.out.print(litr.previous());
        System.out.println();
    }
}