package shape;

public class ShapeTest {
	public static void main(String[] args) {
		//Heterogeneous Collection
		//���� ���� �ƴ� ���� �ٸ� ���� ����ü
		Shape s[] = new Shape[3];
		s[0] = new Circle(new Point(1,1),5);
		s[1] = new Triangle(new Point(2,2),5,6);
		s[2] = new Rectangle(new Point(3,3),5,6);
		//Polymorphism
		for(Shape sh:s) {
			sh.movepoint(new Point (5, 5));
			if(sh instanceof Circle) {//Circle�� specialize �� �Լ� ��� ���� instanceof ���, sh�� color�϶�
				Circle c = (Circle)sh;//���ο� Circle�� �����Ͽ� sh�� type casting(����ȯ)�Ͽ� �Լ� ����Ѵ�.
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
