package ws;

import java.util.Arrays;

public class User {
	private String name;
	private Car cars[];
	
	
	public User(String name, Car[] cars) {
		this.name = name;
		this.cars = cars;
	}


	@Override
	public String toString() {
		return "User [ÀÌ¸§:" + name + ", Â÷: " + Arrays.toString(cars) + "]";
	}


}
