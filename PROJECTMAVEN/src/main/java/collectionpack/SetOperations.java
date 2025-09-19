package collectionpack;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		s.add("red");
		s.add("blue");
		s.add("green");
		s.add("red");
		s.add("White");
		System.out.println(s);
		Set<String> x=new HashSet<String>();
		x.add("apple");
		x.add("orange");
		x.add("grapes");
		x.add("kiwi");
		System.out.println(x);
		System.out.println(x.addAll(s));
		System.out.println(x);
		System.out.println(x.containsAll(s));
		System.out.println(x.contains("green"));
System.out.println(x.isEmpty());
x.remove("kiwi");
System.out.println(x);
s.clear();
System.out.println(s);
System.out.println(s.isEmpty());

	}

}
