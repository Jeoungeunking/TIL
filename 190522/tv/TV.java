package tv;

public class TV {//TV�� ������ ���赵/Ʋ
	//attribute
	private String color;//public �����Ӱ� ���� ���� ����. encapsulation�� �� �� ����
	boolean power;
	public int channel;
	//constructor(attribute �ʱ�ȭ ����)
	TV(){//���� Ÿ���� ����X
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
		this.color = color;//(this. this�� ��Ī�ϴ� ���� ��)
		this.power = false;
		this.channel = 10;
	}
	//function
	//��Ŭ��-�ҽ�-generate getter setter//private �Լ� ��� ����
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		//���� �������� �Ѵ�.
		//�÷��� ��� ����
		if(color.equals("")||color == null) {//������
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