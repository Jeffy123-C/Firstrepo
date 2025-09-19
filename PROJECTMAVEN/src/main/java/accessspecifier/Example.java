package accessspecifier;

public class Example {
	public void pubmethod()
	{
		System.out.println("public method");
	}
	private void privatemethod()
	{
		System.out.println("private method");
	}
	void defmethod()
	{
		System.out.println("default method");
	}
	protected void promethod()
	{
		System.out.println("protect method");
	}
	
	public static void main(String[] args) {
		Example obj=new Example();
		obj.pubmethod();
		obj.promethod();
		obj.privatemethod();
		obj.defmethod();
	
	

	}

}
