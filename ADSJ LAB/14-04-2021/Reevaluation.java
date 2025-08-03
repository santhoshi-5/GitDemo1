import java.util.*;
class Reevaluation{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no. of entries");
      int n=sc.nextInt();
      sc.nextLine();
      HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
      HashMap<Integer, String> std=new HashMap<Integer,String>();
      System.out.println("Enter student id, student name and subject code of each entry");
      for(int i=0;i<n;i++){
         String[] r=sc.nextLine().split(" ");
         int q=Integer.parseInt(r[0]);
         std.put(q,r[1]);
         if(!(hm.containsKey(q)))
                hm.put(q,1);
         else
               hm.put(q,hm.get(q)+1);
       }
       System.out.println(hm);
       Set<Map.Entry<Integer,Integer>> setmap=hm.entrySet();
       for(Map.Entry<Integer,Integer> m:setmap){
            int q=m.getKey();
            if(m.getValue()>1)
                System.out.println(std.get(q)+" "+ q);
       }
}
}