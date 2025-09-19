package collectionpack;

import java.util.ArrayList;
import java.util.List;

public class Listing {

	public static void main(String[] args) {
		List<String>li= new ArrayList<String>();
		System.out.println(li);
		li.add("red");
		li.add("blue");
		li.add("green");
		li.add("Yellow");
		li.add("Black");
		li.add("red");
		System.out.println(li);
		li.set(1,"white");
		System.out.println(li);
		System.out.println(li.indexOf("green"));
		System.out.println(li.lastIndexOf("green"));
		System.out.println(li.contains("grey"));
		System.out.println(li.isEmpty());
		//remove
		System.out.println(li.remove(2));
		System.out.println(li);
		//get
		System.out.println(li.get(0));
		//size
		System.out.println(li.size());
		//for(int i=0;i<li.size;i++)
		for(int i=0;i<5;i++)
		{
			System.out.println(li.get(i));
		}
		for(String a:li)
		{
			System.out.println(a);
		}
	}

}
