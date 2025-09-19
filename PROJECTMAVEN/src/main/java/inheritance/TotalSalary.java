package inheritance;

public class TotalSalary extends SalaryComponents{

	    double totalSalary;

	    public void calculateTotalSalary() {
	        calculateComponents();  // ensure HRA and PF are calculated
	        totalSalary = basicPay + hra - pf - deduction + bonus;
	    }
	}



