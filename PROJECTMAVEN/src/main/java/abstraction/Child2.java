package abstraction;

public class Child2 extends Parent2{

	public static void main(String[] args) {
		Parent2 obj=new Child2();
		obj.sum();
		obj.display();
		//obj.show we cannot get child class property by parent class reference
		Child2 obj1=new Child2();
		obj1.show();
		// TODO Auto-generated method stub

	}

	@Override
	public void sum() {
		int a=5;
		int b=4;
		int c=a+b;
		System.out.println(c);
		// TODO Auto-generated method stub
		
	}
	public void show()
	{
		System.out.println("Hi");
	}

}
