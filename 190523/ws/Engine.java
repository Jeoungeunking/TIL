package ws;

public class Engine {
	
	private int displacement=2000;
	private int e_type=4;
	public Engine() {
		this.displacement = 2000;
		this.e_type = 4;
	}
	public Engine(int displacement, int e_type) {
		this.displacement = displacement;
		this.e_type = e_type;
	}

	public String toString() {
		return "Engine [배기량은: " + displacement + ", 엔진방식은: " + e_type + "기통]";
	}
	public  int getDisplacement() {
		return displacement;
	}
	public  int getE_type() {
		return e_type;
	}

	

}
