import java.util.*;
class ContainsDemo
{
	public static void main(String[] args)
	{
		Map<String,Integer> S= new HashMap<String,Integer>();
		S.put("Machew",50);
		S.put("Lisa",76);
		S.put("David",49);
		S.put("paul",49);
		S.put("Courtney",45);
		System.out.println(S);
		if(S.containsKey("Lisa"))
			System.out.println("Number of productssold by lisa is"+ S.get("Lisa"));
		else
			System.out.println("Lisa entry doesnot exist");
	}
}