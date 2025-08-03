import java.util.*;

public class Main3
{
	
   public static void main(String[] args)
	
    {
		
      Scanner sc = new Scanner(System.in);
      HashSet<Character> hs=new HashSet<Character>();
      String input=sc.nextLine();
      for(int i=0;i<input.length();i++)
         hs.add(input.charAt(i));
      for(Character s:hs)System.out.print(s);
   }
}