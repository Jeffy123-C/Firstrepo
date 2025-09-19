package inheritance;

public class SalaryComponents extends Employee {
	
	    double hra, pf;

	    public void calculateComponents() {
	        hra = 0.05 * basicPay;  // 5% HRA
	        pf = 0.20 * basicPay;   // 20% PF
	    }
	}

