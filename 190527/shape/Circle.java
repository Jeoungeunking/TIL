package shape;

public class Circle extends Shape {
	private int radius;
	private String color;

	public Circle() {
	}
	
	public Circle(Point point, int radius) {
		super(point);
		this.radius = radius;
	}
	public Circle(Point point, int radius, String color) {
		super(point);
		this.radius = radius;
		this.color = color;
	}

	public void fillColor(String color) {
		this.color = color;
		
	}

	@Override
	public double getArea() {
		double area = radius*radius*Math.PI;
		return area;
	}

	@Override
	public double getcircume() {
		double circume;
		circume=2*Math.PI*radius;
		return circume;
	}

	@Override
	public String toString() {
		return "Circle [point=" + point + ", radius=" + radius + ", color=" + color + "]";
	}

	


	
	

}
