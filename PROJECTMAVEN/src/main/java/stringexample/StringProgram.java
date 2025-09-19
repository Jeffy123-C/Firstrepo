package stringexample;

public class StringProgram {
	

	public static void main(String[] args) {
		String s="Hello";
		System.out.println(s);
		String a=new String ("Hi");
		System.out.println(a);
//length method
		System.out.println(s.length());
		//concat method
		System.out.println(a.concat(s));
		//to uppercase
		System.out.println(s.toUpperCase());
		//tolowercase
		System.out.println(s.toLowerCase());
		//is empty
		String b="";
		System.out.println(b.isEmpty());
		//contains
		String d=("How are you");
		System.out.println(d.contains("H"));
		System.out.println(s.contains(a));
		//equals
		String x="java";
		String y="java";
		String z="Java";
		String w="Selenium";
		System.out.println(x.equals(y));
		System.out.println(x.equals(z));
		System.out.println(x.equals(w));
		//equalsignorecase
		System.out.println(x.equalsIgnoreCase(z));
		String r=new String ("java");
		System.out.println(r.equals(x));
		System.out.println(r==x);
		//valueof
		int p=5;
		System.out.println(String.valueOf(p));
		System.out.println(s.charAt(0));
	}

}
