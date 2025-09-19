package aggregation;

public class Class2 {
	int number;
	String bird;
	Parent2 ref;
	public Class2(int number,String bird,Parent2 ref)
	{
		this.number=number;
		this.bird=bird;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println("number is "+number+" Bird is "+bird);
		System.out.println(ref.number+ref.bird);
	}
	public static void main(String[] args) {
		Parent2 obj1=new Parent2(" parrot",3);
		Class2 obj=new Class2(5,"crow",obj1);
		obj.display();
		
		// TODO Auto-generated method stub

	}

}
