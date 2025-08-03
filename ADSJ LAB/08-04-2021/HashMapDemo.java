import java.util.*;
class HashMapDemo
{
	public static void main(String[] args)
	{
		HashMap<String,Double> hm=new HashMap<>();
		hm.put("John",new Double(3434.34));
		hm.put("Tom Smith",new Double(123.22));
		hm.put("Jane Baker",new Double(1378.00));
		hm.put("Tod Hall",new Double(99.22));
		hm.put("Ralph Smith",new Double(-19.08));
		
		Set<Map.Entry<String,Double>> myset=hm.entrySet();
		for(Map.Entry<String,Double> me:myset)
		{
			System.out.println(me.getKey()+":");
			System.out.println(me.getValue());
		}
		System.out.println(hm);
		Double balance=hm.get("John");
		hm.put("John",balance+1000);
		System.out.println("John new balance: "+hm.get("Jhon"));
	}
}
			
