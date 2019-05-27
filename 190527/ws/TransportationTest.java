package ws;

public class TransportationTest {
	public static void main(String[] args) {
		Public subway = new Public(1200,100,45,"1호선",new Point(3,3),new Point(11,2));
		Walking person = new Walking(4, "나", new Point(3,4), new Point(12,12));
		subway.c_distance();
		subway.c_time();
		System.out.println(subway);
		person.c_distance();
		person.c_time();
		System.out.println(person);
		System.out.println("요금은: "+subway.c_fee());
	}

}
