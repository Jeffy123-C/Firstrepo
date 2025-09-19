package interfacee;

public class Child2 implements Parent1 {

	public static void main(String[] args) {
	Parent1 obj=new Child2();
	obj.sum();

	}

	@Override
	public void sum() {
		int a=3;
		int b=2;
		int c=a+b;
System.out.println(c);
		// TODO Auto-generated method stub
		
	}

}
