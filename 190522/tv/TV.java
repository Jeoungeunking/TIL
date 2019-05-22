package tv;

public class TV {//TV를 만들어내는 설계도/틀
	//attribute
	private String color;//public 자유롭게 변수 접근 가능. encapsulation이 안 된 상태
	boolean power;
	public int channel;
	//constructor(attribute 초기화 역할)
	TV(){//리턴 타입지 존재X
		color = "red";
		power = false;
		channel = 10;
	}
	TV(String color, boolean power, int channel){//argument
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
	TV(String color){//argument
		this.color = color;//(this. this가 지칭하는 다음 값)
		this.power = false;
		this.channel = 10;
	}
	//function
	//우클릭-소스-generate getter setter//private 함수 출력 위해
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		//숫자 못들어오게 한다.
		//컬러는 몇개로 제한
		if(color.equals("")||color == null) {//안정빵
		return;}
		this.color = color;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	void power() {
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void ChannelDown() {
		channel--;
	}
	@Override
	public String toString() {
		return "TV [color=" + color + ", power=" + power + ", channel=" + channel + "]";
	}
	
}