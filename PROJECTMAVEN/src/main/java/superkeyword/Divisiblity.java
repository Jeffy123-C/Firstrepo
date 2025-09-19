package superkeyword;

public class Divisiblity extends Add {
	public void check(int a, int b) {
        int result = super.add(a, b); // using super to call parent class method
        System.out.println("Result is " + result);
        
        if (result % 10 == 0) {
            System.out.println("The result is divisible by 10.");
        } else {
            System.out.println("The result is not divisible by 10.");
        }
    }

	public static void main(String[] args) {
		 Divisiblity obj = new Divisiblity();
	        obj.check(25, 15);

	}

}
