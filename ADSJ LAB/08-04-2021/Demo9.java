import java.util.*;
public class Demo9
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    HashMap<String,Double> hm = new HashMap<String,Double>();
	    System.out.println("Enter number of entries");
	    int n = sc.nextInt();
	    sc.nextLine();
	    System.out.println("Enter entries as name (space) amount");
	    for(int i=0;i<n;i++)
	    {
	        String str = sc.nextLine();
	        String s[] = str.split(" ");
	        hm.put(s[0],Double.parseDouble(s[1]));
	    }
	    //TreeSet<Double> ts = new TreeSet<Double>();
	    Double max=0.000;
	    Set<Map.Entry<String,Double>> ts = hm.entrySet();
	    for(Map.Entry<String,Double> m : ts)
	    {
	        if(max<m.getValue())
	            max=m.getValue();
	    }
	    System.out.println("Details of hall with highest rent:");
	    for(Map.Entry<String,Double> m : ts)
	    {
	        if(max.equals(m.getValue()))
	            System.out.println(m.getKey()+"  "+m.getValue());
	    }
	}
}