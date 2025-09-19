package interfacee;

public interface Parent {
	public static final int a=3;
	int b=4;
	public abstract void sum();
	default void show()
	{
		System.out.println("Hello");
	}
public static void display()
{
	System.out.println("Hi");
}

}
