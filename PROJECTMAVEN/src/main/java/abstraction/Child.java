package abstraction;

public class Child extends Abstract1{

	public static void main(String[] args) {
	Child obj=new Child();
	obj.sum();
	obj.difference();

	}

	@Override
	public void sum() {
		int a=3;
		int b=1;
		int c =a+b;
		System.out.println(c);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void difference() {
		int a=4;
		int b=1;
		int c=a-b;
		System.out.println(c);
		// TODO Auto-generated method stub
		
	}

}
