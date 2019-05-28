package db;

public class UserDao extends Dao {
	public UserDao() {
		
	}
	public UserDao(String ip) {
		super(ip);
	}
	@Override
	public Object select(Object o) {
		User user = null;
		String str = (String)o;
		//DB에서 SELECT해서 데이터를 가져온다.
		user = new User("id01", "Tom", "pwd01");
		return user;		
	}

	@Override
	public void insert(Object o) {
		connection();
		User user = (User)o;
		System.out.println(user.getId()+" "+user.getName()+" "+user.getPwd()+"Inserted...");
		close();
	}

	@Override
	public void delete(Object o) {
		String str = (String)o;
		connection();
		System.out.println(str+" delete..");
		close();
	}


}
