package shape;

public class Triangle extends Shape {
	private int width;
	private int height;
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(Point point, int width, int height) {
		super(point);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		double area = width*height*0.5;
		return area;
	}

	@Override
	public double getcircume() {
		double circume = width+height+Math.sqrt(Math.pow(height,2)+Math.pow(width, 2));
		return circume;
	}

	@Override
	public String toString() {
		return "Triangle [point=" + point + ", width=" + width + ", height=" + height + "]";
	}


}
