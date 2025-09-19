package encapsulation;

public class User {

	public static void main(String[] args) {
		
        Bank obj1 = new Bank();
        obj1.setPin(1234);;           // Set a valid PIN
        System.out.println(obj1.getPin());  // Pass PIN to bank
        obj1.withdraw(500);   
		
	
		

	}

}
