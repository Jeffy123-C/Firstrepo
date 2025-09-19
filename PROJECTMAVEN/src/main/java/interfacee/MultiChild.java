package interfacee;

public class MultiChild implements MultipleParent,MultipleParent2 {

	public static void main(String[] args) {
		MultiChild obj=new MultiChild();
		obj.display();
		obj.sum();

	}

	@Override
	public void display() {
		System.out.println("Hello");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sum() {
		int a=2;
		int b=3;
		int c=a+b;
		System.out.println(c);
		// TODO Auto-generated method stub
		
	}

}
