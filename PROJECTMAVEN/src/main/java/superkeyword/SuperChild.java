package superkeyword;

public class SuperChild extends SuperVariable{
	String color="blue";
	public void display()
	{
	System.out.println(super.color);
	}
	public static void main(String[] args) {
		SuperChild obj =new SuperChild();
		System.out.println(obj.color);
		obj.display();
		

	}

}
