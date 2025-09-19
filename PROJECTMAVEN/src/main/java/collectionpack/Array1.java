package collectionpack;

import java.util.ArrayList;
import java.util.Iterator;

public class Array1 {

	public static void main(String[] args) {
	ArrayList<String> a=new ArrayList<String>();
	a.add("red");
	a.add("Green");
	a.add("Yellow");
	a.add("White");
	System.out.println(a);
	ArrayList<String> b=new ArrayList<String>();
	b.add("apple");
	b.add("grapes");
	b.add("orange");
	b.add("kiwi");
	System.out.println(b);
	//addall
	System.out.println(a.addAll(b));
	System.out.println(a);
	System.out.println(b);
	//containsAll
	System.out.println(a.containsAll(b));
	System.out.println(b.containsAll(a));
	//iterator
	Iterator<String> it = b.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	it.remove();
	System.out.println(b);
	
	
	
	}
}


