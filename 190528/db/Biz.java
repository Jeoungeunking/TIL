package db;

public abstract class Biz {
	String id;
	public Biz() {
	}
	public Biz(String id) {
		this.id = id;
	}
	public abstract void register(Object o);
	public abstract void remove(Object o);
	public abstract void select(Object o);
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Object get(Object o) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
