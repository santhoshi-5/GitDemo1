import java.util.*;
public class Children
{
	public static void main(String[] args) 
	{
		HashSet<String> cookie = new HashSet<String>();
		cookie.add("Ayush");
		cookie.add("Azaan");
		cookie.add("Bahadurjit");
		cookie.add("Balhaar");
		cookie.add("Chakradev");
		cookie.add("Vishnu");
		cookie.add("Chakradhar");
		cookie.add("Champak");
		cookie.add("Devansh");
		cookie.add("Dakshesh");
		HashSet<String> chips = new HashSet<String>();
		chips.add("Balvan");
		chips.add("Balveer");
		chips.add("Banjeet");
		chips.add("Chakradev");
		chips.add("Chakradhar");
		chips.add("Devansh");
		
		HashSet<String> h1 = new HashSet<String>(cookie);
		h1.addAll(chips);
		System.out.println(h1);
		
		HashSet<String> h2 = new HashSet<String>(cookie);
		h2.retainAll(chips);
		System.out.println(h2);
		
		HashSet<String> h3 = new HashSet<String>(cookie);
		cookie.removeAll(chips);
		System.out.println(cookie);
	}
}