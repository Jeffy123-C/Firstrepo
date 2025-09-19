package abstraction;

public class FullTimeEmployee extends Employee {
	double hourlyRate;

	  public FullTimeEmployee(double hourlyRate) {
	       
	        this.hourlyRate = hourlyRate;
	    }
	 
	   
		public  static void main(String[] args) {
			Contractor obj = new Contractor( 200, 6);
	        FullTimeEmployee obj1 = new FullTimeEmployee( 200);
	        System.out.println( "Contractor salary: $" + obj.calculateSalary());
	        System.out.println("FullTimeEmployee salary: $" + obj1.calculateSalary());
	        
	        
		}


		@Override
		public double calculateSalary() {
			// TODO Auto-generated method stub
			return hourlyRate*8;
		}

	}


	