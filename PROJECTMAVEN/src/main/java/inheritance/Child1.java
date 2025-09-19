package inheritance;

public class Child1 extends Hierarchial  {
	public void sum(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Child1 obj=new Child1();
		obj.display();
		obj.sum(2,3);
		System.out.println(obj.a);
		// TODO Auto-generated method stub

	}

}
