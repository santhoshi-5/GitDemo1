import java.util.*;
interface Stack<T>
{
    void push(T x);
    T pop();
    T topElement();
    boolean isStackFull();
    boolean isStackEmpty();
}
class ArrayListStack<T> implements Stack<T>
{
    ArrayList<T> al;
    ArrayListStack()
    {
        al = new ArrayList<T>();
    }
    public boolean isStackEmpty()
    {
        return al.size()==0;
    }
    public boolean isStackFull()
    {
        return false;
    }
    public void push(T x)
    {
        al.add(x);
    }
    public T pop()
    {
        if(isStackEmpty())
        {
            System.out.println("Stack is Empty");
            return null;
        }
        else
        {
            T y;
            y = al.get(al.size()-1);
            al.remove(al.size()-1);
            return y;
        }
    }
    public T topElement()
    {
        if(isStackEmpty())
        {
            System.out.println("Stack is Empty");
            return null;
        }
        else
        {
            return al.get(al.size()-1);
        }
    }
    void display()
    {
        if(isStackEmpty())
            System.out.println("Stack is empty");
        else
        {
            for(int i=0;i<al.size();i++)
            {
                System.out.print(al.get(i)+" ");
            }
            System.out.println();
        }
    }
}
public class ALStackMain
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        ArrayListStack<Integer> ls = new ArrayListStack<Integer>();
        int ch;
        Integer ele;
        System.out.println("Integer stack");
        do
        {
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Top");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.println("Enter choice");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1: System.out.println("Enter element");
                        ele = sc.nextInt();
                        ls.push(ele);
                        ls.display();
                        break;
                case 2 :ele = ls.pop();
                        if(ele!=null)
                            System.out.println("Poped element is: "+ele);
                        ls.display();
                        break;
                case 3 : ele = ls.topElement();
                        if(ele!=null)
                            System.out.println("Top element is: "+ele);
                        ls.display();
                        break;
                case 4 : ls.display();
                        break;
                case 5: break;
                default : System.out.println("Invalid choice");
            }
        }while(ch<5);

        ArrayListStack<String> ss = new ArrayListStack<String>();
        String e;
        System.out.println("Strings Stack");
        do
        {
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Top");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.println("Enter choice");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1: System.out.println("Enter element");
                        e = sc.next();
                        sc.nextLine();
                        ss.push(e);
                        ss.display();
                        break;
                case 2 : e = ss.pop();
                        if(e!=null)
                            System.out.println("Poped element is: "+e);
                        ss.display();
                        break;
                case 3 : e = ss.topElement();
                        if(e!=null)
                            System.out.println("Top element is: "+e);
                        ss.display();
                        break;
                case 4 : ss.display();
                        break;
                case 5: break;
                default : System.out.println("Invalid choice");
            }
        }while(ch<5);
	}
}