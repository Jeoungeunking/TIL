package ws;

public class UserTest {
	public static void main(String[] args) {
		Engine engine = new Engine(1000, 6);
		Car car1 = new Car();
		Car car2 = new Car("abc",engine,"yellow");
		Car cars[] = {car1, car2};
		User user1 = new User("±èÃ¶¼ö",cars);
		System.out.println(user1.toString());

	}

}
