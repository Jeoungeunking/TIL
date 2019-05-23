package car;

public class Car {
	//attribute
	private String name;
	private String color;
	private int fSize;//fuel_size
	private int speed;
	private int maxSpeed;
	private int cfSize;
	//constructor: Ŭ���� �⺻ ������ ���� �Լ�
	public Car() {//overload
		this.name = "K1";
		this.color = "red";
		this.fSize = 50;
		this.maxSpeed = 50;
	}
	public Car(String name, String color, int fSize) {
		this.name=name;
		this.color=color;
		this.fSize=fSize;
	}
	public Car(String name, String color, int fSize, int maxSpeed) {
		super();
		this.name = name;
		this.color = color;
		this.fSize = fSize;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", fSize=" + fSize + ", speed=" + speed + ", maxSpeed="
				+ maxSpeed + ", cfSize=" + cfSize + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getfSize() {
		return fSize;
	}
	public void setfSize(int fSize) {//���� ����?
		this.fSize = fSize;//���� ��������ִ� ��ü�� reference �� .������
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(this.maxSpeed<speed) {
			this.maxSpeed = this.maxSpeed;
			return;//�Լ��� ��
		}
		this.speed = speed;
	}
	public int getCfSize() {
		return cfSize;
	}
	public void setCfSize(int cfSize) 
			throws Exception {//�� �Լ��� ����� ������ ������ �߻� �� �� �ֽ��ϴ�.
		if(this.cfSize+cfSize>fSize) {
			throw new Exception();//�̷��� �߻��մϴ�.
		}
		this.cfSize+=cfSize;

	}
	
	public void go(int level) {//�Լ��� argument
		//level 1~5
		//speed up 1:20km
		//fuel down 1L 10km
		switch(level) {
		case 1:
			this.setSpeed(20);
			this.cfSize-=1;
			break;
		case 2:
			this.setSpeed(40);
			this.cfSize-=2;
			break;
		case 3:
			this.setSpeed(60);
			this.cfSize-=3;
			break;
		case 4:
			this.setSpeed(80);
			this.cfSize-=4;
			break;
		case 5:
			this.setSpeed(100);
			this.cfSize-=5;
			break;
		default:
			break;
		}
	}
	public void stop() {
		this.speed = 0;
		
	}
	

}
