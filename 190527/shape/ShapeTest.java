package shape;

public class ShapeTest {
	public static void main(String[] args) {
		//Heterogeneous Collection
		//같은 종이 아닌 서로 다른 종의 집합체
		Shape s[] = new Shape[3];
		s[0] = new Circle(new Point(1,1),5);
		s[1] = new Triangle(new Point(2,2),5,6);
		s[2] = new Rectangle(new Point(3,3),5,6);
		//Polymorphism
		for(Shape sh:s) {
			sh.movepoint(new Point (5, 5));
			if(sh instanceof Circle) {//Circle에 specialize 된 함수 사용 위해 instanceof 사용, sh가 color일때
				Circle c = (Circle)sh;//새로운 Circle을 생성하여 sh를 type casting(형변환)하여 함수 사용한다.
				c.fillColor("red");
			}
			System.out.println(sh.toString());
			System.out.println(sh.getArea());
			System.out.println(sh.getcircume());
			
		}
		s[1].movepoint(new Point(1,3));
		System.out.println(s[1].toString());
	}

}
