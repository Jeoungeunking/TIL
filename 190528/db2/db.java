package db2;

public abstract class db {
	String ip;//하위클래스를 위한 선언
	public db() {
		
	}
	public db(String ip) {
		this.ip = ip;
	}

	public void connection() {
		System.out.println(ip+" Connect...");
	}
	public void close() {
		System.out.println(ip+" Close...");
		
	}
	public abstract void insert(Object obj);//Object의 reference에는 모든 하위클래스가 포함된다.
	//public abstract void remove(Object obj);
	public abstract Object select(Object obj);
}
