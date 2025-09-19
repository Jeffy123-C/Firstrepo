package abstraction;

public class Contractor extends Employee{
	double hourlyRate;
    int hoursWorked;

    public Contractor( double hourlyRate, int hoursWorked) {
        
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return hourlyRate * hoursWorked;
	}


}
