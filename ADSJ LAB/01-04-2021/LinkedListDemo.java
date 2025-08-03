import java.util.*;
class LinkedListDemo{
	public static void main(String[] args){
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("f");
		ll.add("b");
		ll.add("c");
		ll.add("g");
		ll.add("e");
		ll.addLast("z");
		ll.addFirst("a");
		ll.add(1,"a2");
		System.out.println("Original contents of ll:"+ll);
		ll.remove("f");
		ll.remove(2);
		System.out.println("Contents of ll after deletion:"+ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println("ll after deleting first and last elements:"+ll);
		String val=ll.get(2);
		ll.set(2,val+" changed");
		System.out.println("ll after change:"+ll);
	}
}