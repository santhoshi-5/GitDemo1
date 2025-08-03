import java.util.*;
class Book implements Comparable<Book>{
	int bno;
	String title,name;
	Book(int c,String t,String nam){
		bno=c;
		title=t;
		name=nam;
	}
	@Override
	public int compareTo(Book b1){
		return this.title.compareTo(b1.title);
	}
	public String toString(){
		return " Book Number :"+bno+" Title :"+title+" Author :"+name+"\n";
	}
}
class CompBook6{
	public static void main(String[] args){
		TreeMap<Book,Integer> bm=new TreeMap<>();
		bm.put(new Book(1001,"Java","Hs"),500);
		bm.put(new Book(1002,"CO","MM"),112);
		bm.put(new Book(1003,"DBMS","RK"),142);
		bm.put(new Book(1210,"AFL","HB"),113);
		Set<Map.Entry<Book,Integer>> bookSet=bm.entrySet();
		for(Map.Entry<Book,Integer> entry: bookSet){
			Book b=entry.getKey();
			System.out.print("Book Details "+b);
			System.out.print(" Price :"+entry.getValue());
			System.out.println();
		}
	}
}