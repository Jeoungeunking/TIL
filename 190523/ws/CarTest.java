package ws;

public class CarTest {
	public static void main(String[] args) {
		Engine e1 = new Engine();
		Car car1 = new Car("abc",e1.getDisplacement(),e1.getE_type(),"blue");// name , 배기량, 엔진종류, 색상
		Car car2 = new Car("K1",e1.getDisplacement(),e1.getE_type(),"red");
		car1.toString()
		
	}
}
