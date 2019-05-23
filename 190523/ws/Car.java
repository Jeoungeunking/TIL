package ws;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Car {
	private String serial;
	private String name;
	private Engine engine;
	private String color;
	public static int cnt=1000;
	Engine e1 = new Engine();
	
	public Car() {
		this.name = "K1";
		this.engine = e1;
		this.color = "blue";
		this.serial = serial();
		cnt++;		
	}
	public Car(String name, Engine engine , String color) {
		this.name = name;
		this.engine = engine;
		this.color = color;
		this.serial = serial();
		cnt++;
	}

	public String serial(){
		String serial;
		Date today = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyyMMddhhmmss");
        serial= date.format(today)+cnt;
		return serial;
	}
	@Override
	public String toString() {
		return "Car [시리얼:" + serial + ", 차명:" + name + ", 엔진:" + engine + ", 색: " + color + "]";
	}
	



  }