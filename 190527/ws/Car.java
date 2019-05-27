package ws;
 
public class Car extends Transportation{
    private int gasMileage = 10;
    private int gasFee = 1502;
    
    public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int speed, String id, Point a, Point d) {
		super(speed, id, a, d);
	}
	public int c_fee()
    {
        double result = 0;
        result = this.distance / (double)gasMileage; 
        return (int)(result * gasFee);
    }
    @Override
    public String toString() {
        return "Car [gasMileage=" + gasMileage + ", gasFee=" + 
    gasFee + ", distance=" + distance + ", toString()="
                + super.toString() + "]";
    }
}

