package db2;

public class dbUser extends db {
	
	public dbUser() {
		
	}
	public dbUser(String ip) {
		super(ip);
	}

	@Override
	public void insert(Object obj) {
		connection();//���� �Էµ� ip�� connection
		User user = (User)obj;
		System.out.println(user.getId()+" "+user.getName()+" "+user.getPwd()+" Inserted...");
		close();
		
	}

	@Override
	public Object select(Object obj) {//id�Է�
		User user = null;
		String str =(String)obj;
		connection();
		user = new User("id02","tom","pwd02");//str �̿��ؼ� db���� �����Դ� ġ��.
		close();
		return user;
	}

}
