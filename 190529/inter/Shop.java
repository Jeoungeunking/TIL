package inter;

public interface Shop {
	public void register();// 추상메서드만 사용하기 때문에 abstract 사용 가능
	public void login();
	public void order();
	public void logout();
	//기능만 정의해놓으면 다양한 쇼핑몰 만들 수 있다.
}
