package db2;

public class App {

	public static void main(String[] args) {
		String id = "id02";
		String name = "tom";
		String pwd = "pwd02";
		db db1 = new dbUser("192.100.100.1");//해당 ip에 접속할 Userdb 생성
		
		User user = new User(id, name, pwd);
		db1.insert(user);
		
		User dbuser = null; //select실행시 user가 튀어나온다!
		dbuser = (User)db1.select("id02");
		System.out.println(dbuser);
		
	}
}
