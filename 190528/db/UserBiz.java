package db;

public class UserBiz extends Biz {
	
	public UserBiz() {
		super();
	}

	public UserBiz(String id) {
		super(id);
	}

	@Override
	public void register(Object o) {
		dao.insert(obj)
	}

	@Override
	public void remove(Object o) {
		// TODO Auto-generated method stub
		dao.delete(o);
	}

	@Override
	public void select(Object o) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Object get(Object o) {
		User user = null;
		user= (User)dao.select(object);
		return user;
		
	}

}
