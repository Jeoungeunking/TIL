package car;

public class carTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		System.out.println(car1);
		try {
			car1.setCfSize(50);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Too Much...");
		}
		System.out.println(car1);
		car1.go(4);
		System.out.println(car1);

	}

}
