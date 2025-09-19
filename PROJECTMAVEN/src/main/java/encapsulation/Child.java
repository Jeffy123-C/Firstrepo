package encapsulation;

public class Child {

	public static void main(String[] args) {
		Parent obj=new Parent();
		obj.setMark(98);
		obj.setName("Jeffy");
		System.out.println(obj.getMark());
		System.out.println(obj.getName());
		
		
		

	}

}
