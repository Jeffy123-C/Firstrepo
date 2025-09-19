package encapsulation;

public class Child1 {

	public static void main(String[] args) {
		Parent1 obj=new Parent1();
		obj.setAge(30);
		obj.setColor("red");
		obj.setNumber(23);
		System.out.println(obj.getAge());
		System.out.println(obj.getColor());
		System.out.println(obj.getNumber());
		// TODO Auto-generated method stub

	}

}
