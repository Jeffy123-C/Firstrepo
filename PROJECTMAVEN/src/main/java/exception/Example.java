package exception;

public class Example {
	
	

	public static void main(String[] args) throws Exception {
		int age=15;
		if (age>18)
		{
			System.out.println("Eligible for Voting");
		}
		else
		{
			throw new Exception("Not eligible");
		}

	}

}
