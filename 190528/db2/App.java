package db2;

public class App {

	public static void main(String[] args) {
		String id = "id02";
		String name = "tom";
		String pwd = "pwd02";
		db db1 = new dbUser("192.100.100.1");//�ش� ip�� ������ Userdb ����
		
		User user = new User(id, name, pwd);
		db1.insert(user);
		
		User dbuser = null; //select����� user�� Ƣ��´�!
		dbuser = (User)db1.select("id02");
		System.out.println(dbuser);
		
	}
}
