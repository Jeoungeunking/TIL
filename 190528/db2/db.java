package db2;

public abstract class db {
	String ip;//����Ŭ������ ���� ����
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
	public abstract void insert(Object obj);//Object�� reference���� ��� ����Ŭ������ ���Եȴ�.
	//public abstract void remove(Object obj);
	public abstract Object select(Object obj);
}
