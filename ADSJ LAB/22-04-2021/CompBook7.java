import java.util.*;
class Book {
	int bno;
	String title,name;
	Book(int c,String t,String nam){
		bno=c;
		title=t;
		name=nam;
	}
	
	public String toString(){
		return " Book Number :"+bno+" Title :"+title+" Author :"+name+"\n";
	}
}
class TitleComparator implements Comparator<Book>{
	@Override
	public int compare(Book b1,Book b2){
		return b1.name.compareTo(b2.name);
	}
}
class CompBook7{
	public static void main(String[] args){
		TreeMap<Book,Integer> bm=new TreeMap<>(new TitleComparator());
		bm.put(new Book(1001,"Java Complete Reference","Hs"),500);
		bm.put(new Book(1002,"Computer Organization","Moris Mano"),120);
		bm.put(new Book(1003,"DBMS","Rama Krishna"),142);
		bm.put(new Book(1210,"AFL","HB"),113);
		Set<Map.Entry<Book,Integer>> bookSet=bm.entrySet();
		for(Map.Entry<Book,Integer> entry: bookSet){
			Book b=entry.getKey();
			System.out.print("Book Details "+b);
			System.out.println("Price :"+entry.getValue());
			
		}
	}
}