package db;

public abstract class Dao {
	private String ip;

	public Dao() {
	}
	public Dao(String ip) {
		this.ip = ip;
	}
	public void connection() {
		System.out.println(ip+":connected..");
	}
	public void close() {
		System.out.println(ip+":closed..");
	}
	// User와 Product 두 종류의 객체를 모두 받기 위해 상위클래스 Object사용.
	public abstract Object select(Object o);//String도 들어올 수 있다..!
	public abstract void insert(Object o);
	public abstract void delete(Object o);
	

}
