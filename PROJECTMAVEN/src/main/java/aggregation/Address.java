package aggregation;

public class Address {
String name;
	String place;
	Student ref;
public Address(String name,String place,Student ref)
{
	this.name=name;
	this.place=place;
	this.ref=ref;
}
public void display()
{
	System.out.println(name+place);
	System.out.println(ref.name+ref.rollnumber);
}
	public static void main(String[] args) {
		Student obj1=new Student("Jeffy ",7);
		Address obj=new Address("D P House;"," TVM",obj1);
		obj.display();
		// TODO Auto-generated method stub

	}

}
	