package methodoverriding;

public class Override2 extends Override1{

	public static void main(String[] args) {
		Override2 obj=new Override2();
		obj.display();
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Hi");
	}

}
