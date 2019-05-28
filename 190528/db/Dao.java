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
	// User�� Product �� ������ ��ü�� ��� �ޱ� ���� ����Ŭ���� Object���.
	public abstract Object select(Object o);//String�� ���� �� �ִ�..!
	public abstract void insert(Object o);
	public abstract void delete(Object o);
	

}
