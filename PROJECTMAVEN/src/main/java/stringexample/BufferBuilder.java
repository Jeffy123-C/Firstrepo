package stringexample;

public class BufferBuilder {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Hello");
		StringBuilder s1= new StringBuilder("Hi");
		System.out.println(s);
		System.out.println(s1);
		//append method
		System.out.println(s.append(s1));
		System.out.println(s.append("world"));
		// TODO Auto-generated method stub
//insert
		System.out.println(s.insert(5,"morning" ));
		//replace
		System.out.println(s.replace(1, 4,"hi" ));
		//delete method
		System.out.println(s.delete(1, 4));
		//reverse
		System.out.println(s.reverse());
	}

}
