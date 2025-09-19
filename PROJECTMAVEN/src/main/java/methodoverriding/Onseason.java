package methodoverriding;

public class Onseason {
	double price;

    // Constructor to set the price
   public Onseason(double price) {
        this.price = price;
    }

    // Method to calculate 40% discount
    public double discount() {
        return price * 0.40;
    }
}


