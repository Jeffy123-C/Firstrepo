package collectionpack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Work {

	public static void main(String[] args) {
		List<String>li=new ArrayList<String>();
		li.add("green");
		li.add("red");
		li.add("blue");
		li.add("green");
		li.add("yellow");
		Iterator<String> it = li.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		

	}

}
