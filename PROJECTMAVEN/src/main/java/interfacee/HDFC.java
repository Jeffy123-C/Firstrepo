package interfacee;

public class HDFC implements RBI{

	public static void main(String[] args) {
		HDFC obj = new HDFC();
        obj.recurringDeposit(5000, 12);
		

	}



	@Override
	public void recurringDeposit(double amount, int months) {
		double maturityAmount = (amount * months)
                + (amount * months * (months + 1) * interestRate) / (2 * 12 * 100);

        System.out.println("Monthly Deposit: ₹" + amount);
        System.out.println("Duration: " + months + " months");
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Maturity Amount: ₹" + maturityAmount);
    }
}
	
	


