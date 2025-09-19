package inheritance;

public class Child2 extends Hierarchial {
	public void product(int a,int b)
	{
		int c=a*b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Child2 obj=new Child2();
		obj.display();
		obj.product(2,3);
		System.out.println(obj.a);
		// TODO Auto-generated method stub

	}

}
