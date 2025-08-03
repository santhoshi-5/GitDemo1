import java.util.*;
public class Main1
{
	public static void main(String[] args) 
	{	
	    Scanner sc = new Scanner(System.in);
	    HashMap<String,Double> hm = new HashMap<String,Double>();
	    double sum=0.0;
	    System.out.println("Enter number of entries");
	    int n = sc.nextInt();
	    sc.nextLine();
        System.out.println("Enter entries name (space) balance amount");
        for(int i=0;i<n;i++)
        {
            String str = sc.nextLine();
            String s[] = str.split(" ");
            hm.put(s[0],Double.parseDouble(s[1]));
        }
        System.out.println("1.Displaying using entrySet() method");
        Set<Map.Entry<String,Double>> entry = hm.entrySet();
        for(Map.Entry<String,Double> em:entry)
        {
            System.out.println(em.getKey()+" "+em.getValue());
            sum=sum+em.getValue();
        }
        System.out.println("Sum of balances: "+sum);
        System.out.println("Enter customer name to be searched");
        String c = sc.nextLine();
        if(hm.containsKey(c))
		System.out.println("Balance of the coustomer entered:"+hm.get(c));
        else
        	System.out.println("Key searched is not found");
            
        
        
        System.out.println("Enter customer name to update balance");
        String s = sc.nextLine();
        System.out.println("Enter the balance to be added:");
	double bal=sc.nextDouble();
	sc.nextLine();
	int p=0;
        for(Map.Entry<String,Double> em:entry)
        {
            if(s.equalsIgnoreCase(em.getKey()))
            {
                p=1;
                hm.put(s,em.getValue()+bal);
            }
            
        }
        if(p==0)
            System.out.println("Key searched is not found");
	System.out.println(hm);
        System.out.println("Enter customer data to be added");
        String str = sc.nextLine();
        String s1[] = str.split(" ");
        hm.put(s1[0],Double.parseDouble(s1[1]));
        System.out.println(hm);
        //Set<Map.Entry<String,Double>> entries = hm.entrySet();  
        System.out.println("Set of keys:"+hm.keySet());
	System.out.println("Displaying map in descending order of keys:");
	Map<String,Double> sm=new TreeMap<String,Double>(hm);
	System.out.println(sm);
	System.out.println("Enter the key to remove it from list");
	String h=sc.nextLine();
	hm.remove(h);
	System.out.println("Hash map after removing "+h+" data from map:"+hm);
	System.out.println("Display all the customers with balance>=75000 using removeif");
	hm.values().removeIf(x->x<75000);
	System.out.println(hm);
	
	}
}