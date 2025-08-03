import java.util.*;
class HashSetArrays2{
   public static void main(String[] args){
      Integer a[]={21,16,14,21,23,23,31,47};
      Set<Integer> hs=new HashSet<Integer>(Arrays.asList(a));
      System.out.println("Integer array as list:"+Arrays.asList(a));
      System.out.println("Elements in the hashset are");
      Iterator<Integer> itr=hs.iterator();
      while(itr.hasNext())
        System.out.print(itr.next()+" ");
      System.out.println();
    }
}