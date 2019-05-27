package shape;

public abstract class Shape{
	protected Point point;
	public Shape() {
		
	}
	public Shape(Point point) {
		this.point=point;
	}
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "Shape [point=" + point + "]";
	}
	public void movepoint(Point point) {
		this.point = point;	
	}
	public abstract double getArea();//추상함수
	public abstract double getcircume();
}
