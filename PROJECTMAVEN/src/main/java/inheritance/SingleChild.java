package inheritance;

public class SingleChild extends Parent{
	public void display()
	{
	System.out.println("Hello");
	}

	public static void main(String[] args) {
		SingleChild obj=new SingleChild ();
		obj.display();
		obj.sum(2,4);
		obj.product(2,4);
		Parent obj1=new Parent();
		obj1.sum(1,3);
		obj1.product(2,3);
		// TODO Auto-generated method st
	}

}
