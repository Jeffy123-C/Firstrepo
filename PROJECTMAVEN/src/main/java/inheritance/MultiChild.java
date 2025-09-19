package inheritance;

public class MultiChild extends Intermediate{
	public void product(int a,int b)
	{
		int c=a*b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		MultiChild obj=new MultiChild();
		obj.display();
		obj.sum(2,3);
		obj.product(2,2);
		// TODO Auto-generated method stub

	}

}
