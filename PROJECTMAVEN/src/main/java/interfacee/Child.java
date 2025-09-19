package interfacee;

public class Child implements Parent {

	public static void main(String[] args) {
		Child obj=new Child ();
		obj.sum();
		obj.show();
		Parent.display();
		// TODO Auto-generated method stub

	}

	@Override
	public void sum() {
		
		int c=a+b;
		System.out.println(c);
		// TODO Auto-generated method stub
		
	}

}
