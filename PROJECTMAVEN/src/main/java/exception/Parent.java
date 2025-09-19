package exception;

public class Parent {

	public static void main(String[] args) {
		try {
		int a=4;
		int b=0;
		int c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException a) 
		{
			System.out.println("exception handled");
			
		}
		finally
		{
			System.out.println("exit code");
		}
		
		try
		{
			int ar[]= {1,2,3,4};
		
		for (int i=0;i<5;i++)
		{
			System.out.println(ar[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("exception handled");
		}
		finally
		{
			System.out.println("exit code");
		}
		//nullpointer exception
		try
		{
			String a=null;
		
		System.out.println(a.length());
		}
		catch(NullPointerException a)
		{
			System.out.println("exception handled");
		}
		finally
		{
			System.out.println("exit code");
		}

}
}
