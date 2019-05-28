package db2;

public class dbUser extends db {
	
	public dbUser() {
		
	}
	public dbUser(String ip) {
		super(ip);
	}

	@Override
	public void insert(Object obj) {
		connection();//위에 입력된 ip로 connection
		User user = (User)obj;
		System.out.println(user.getId()+" "+user.getName()+" "+user.getPwd()+" Inserted...");
		close();
		
	}

	@Override
	public Object select(Object obj) {//id입력
		User user = null;
		String str =(String)obj;
		connection();
		user = new User("id02","tom","pwd02");//str 이용해서 db에서 가져왔다 치자.
		close();
		return user;
	}

}
