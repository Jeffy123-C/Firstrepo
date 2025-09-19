package superkeyword;

public class ChildConstructor extends SuperConstructor
{
	public ChildConstructor()
	{
		super(3);
		System.out.println("Hello Child");
	}
	public ChildConstructor(float a)
	{

		System.out.println(a);
	}
	public static void main(String[] args) {
		 ChildConstructor obj=new  ChildConstructor();
		 ChildConstructor obj1=new  ChildConstructor(0.5f);

	}

}
