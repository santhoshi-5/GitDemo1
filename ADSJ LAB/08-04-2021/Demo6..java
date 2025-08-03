import java.util.*;
import java.io.*;
public class Demo6
{
	public static void main(String[] args) throws IOException
	{
	    BufferedReader br1 = new BufferedReader(new FileReader("File1.txt"));
	    BufferedReader br2 = new BufferedReader(new FileReader("File2.txt"));
	    ArrayList<String> ar1 = new ArrayList<String>();
	    ArrayList<String> ar2 = new ArrayList<String>();
		try
		{
		    String st;
		    while((st=br1.readLine())!=null)
		    {
		        ar1.add(st);
		    }
		    
		    while((st=br2.readLine())!=null)
		    {
		        ar2.add(st);
		    }
		    for(int i=0;i<ar1.size();i++)
		    {
		        int p=0;
		        for(int j=0;j<ar2.size();j++)
		        {
		            if(ar1.get(i).equalsIgnoreCase(ar2.get(j)))
		                p=1;
		        }
		        if(p==0)
		            System.out.println(ar1.get(i));
		    }
	    }
	    catch(FileNotFoundException e)
	    {
	       System.out.println("Exception identified");
	    }
	    finally{
	        br1.close();
	        br2.close();
	    }
	    
	}
}