package inheritance;

public class SalarySlip extends TotalSalary {
	public void printSalarySlip() {
        calculateTotalSalary(); // ensure total salary is calculated
        System.out.println("\n----- Salary Slip -----");
        System.out.println("Basic Pay     : " + basicPay);
        System.out.println("Deduction     : " + deduction);
        System.out.println("Bonus         : " + bonus);
        System.out.println("HRA (5%)      : " + hra);
        System.out.println("PF (20%)      : " + pf);
        System.out.println("------------------------");
        System.out.println("Total Salary  : " + totalSalary);
        System.out.println("------------------------");
    }




	public static void main(String[] args) {
		 SalarySlip obj = new SalarySlip(); // input happens in Employee constructor
	        obj.printSalarySlip();
	    }
	

		

	}


