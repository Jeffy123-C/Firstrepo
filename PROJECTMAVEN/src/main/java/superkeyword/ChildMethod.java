package superkeyword;

public class ChildMethod extends SuperMethod{
	public void sum(int a,int b)
	{this.show();
		super.display();
		
		System.out.println(super.product(2, 2));
	int c=a+b;
	System.out.println(c);
	}
	public void show()
	{
		System.out.println("Hello");
		
		
	
	}
	public static void main(String[] args) {
		ChildMethod obj=new ChildMethod();
		//obj.display();
		obj.sum(2, 3);
		//System.out.println(obj.product(2, 2));
		//obj.show();

	}

}
