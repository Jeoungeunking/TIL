package ws;

public class Public extends Transportation{
	private int initialfee;
	
	public Public() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Public(int initialfee, int fee, int speed, String id, Point a, Point d) {
		super(speed, id, a, d);
		this.fee = fee;
		this.initialfee = initialfee;
		// TODO Auto-generated constructor stub
	}

	public int c_fee() {
		int money = (int)(this.initialfee + this.distance*this.fee);
		return money;
	}

	@Override
	public String toString() {
		return "Public [fee=" + fee + ", distance=" + distance + ", time=" + time + ", speed=" + speed + ", id=" + id
				+ ", a=" + a + ", d=" + d + ", initialfee=" + initialfee + "]";
	}
	

}
