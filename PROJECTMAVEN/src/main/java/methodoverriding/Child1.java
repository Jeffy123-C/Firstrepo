package methodoverriding;

public class Child1 extends Parent1 {
	public void sum(int a,int b)
	{
		super.sum(1,4);

int c=a+b; 
System.out.println(c);
}

	public void display()
	{
		super.display();
		
System.out.println("Hi");
}

	public static void main(String[] args) {
	Child1 obj=new Child1();
	obj.sum(1, 2);
	obj.display();

	}

}
