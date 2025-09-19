package collectionpack;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {

	public static void main(String[] args) {
		List<String>li=new ArrayList<String>();
		
			System.out.println(li);
		
		//add method
		li.add("green");
		li.add("red");
		li.add("blue");
		li.add("green");
		li.add("yellow");
		System.out.println(li);
		//set method
		li.set(1, "blue");
		System.out.println(li);
		//indexof()
		
		System.out.println(li.indexOf("green"));
		System.out.println(li.indexOf("red"));
		//lastindexof
		System.out.println(li.lastIndexOf("green"));
		//contains
		System.out.println(li.contains("green"));
		System.out.println(li.contains("black"));
		//isempty
		System.out.println(li.isEmpty());
		

	}

}
