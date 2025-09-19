package aggregation;

public class Child {
	int age;
	String color;
	Parent ref;
public Child(int age,String color,Parent ref)
{
	this.age=age;
	this.color=color;
	this.ref=ref;
}
public void display()
{
	System.out.println("Age is "+age+"  Color is "+color);
	System.out.println(ref.mark+ref.name);
}
	public static void main(String[] args) {
		Parent obj1=new Parent("Jeffy ",98);
		Child obj=new Child(20,"Red",obj1);
		obj.display();
		// TODO Auto-generated method stub

	}

}
