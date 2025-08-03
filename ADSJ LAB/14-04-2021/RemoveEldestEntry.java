import java.util.*;
  public class RemoveEldestEntry {
   private static final int MAX = 6;
   public static void main(String[] args)
    {
       LinkedHashMap<Integer, String> li = new LinkedHashMap<Integer, String>() {
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest)
            {
                return size() > MAX;
            }
        };
        li.put(0, "Welcome");
        li.put(1, "To");
        li.put(2, "The");
        li.put(3, "World");
        li.put(4, "Of");
        li.put(5, "Java");
        System.out.println("" + li);
        li.put(6, "Programming");
        System.out.println("" + li);
        li.put(7, "Lab");
        System.out.println("" + li);
    }
}