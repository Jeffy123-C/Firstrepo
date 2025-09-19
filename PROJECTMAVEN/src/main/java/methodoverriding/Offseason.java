package methodoverriding;

public class Offseason extends Onseason {
	

	public Offseason(double price) {
		super(price);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	   public double discount() {
	        return price * 0.15;
	    }




	public static void main(String[] args) {
		double purchaseAmount = 1000;
        Onseason obj = new Onseason(purchaseAmount);
        System.out.println("Onseason Discount: Rs. " + obj.discount());
        Offseason obj1 = new Offseason(purchaseAmount);
        System.out.println("Offseason Discount: Rs. " + obj1.discount());
    }

	}


