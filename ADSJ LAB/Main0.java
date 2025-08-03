import java.util.*;
class Main0
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		TreeSet<String> hs = new TreeSet<String>();
		System.out.println("Enter name");
		String s = sc.nextLine();
		hs.add(s);
		System.out.println(hs);
	}
}