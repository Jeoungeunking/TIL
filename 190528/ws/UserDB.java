package ws;

import java.util.ArrayList;

public class UserDB extends DB<User, String>{

	@Override
	public void insert(User obj) {
		System.out.println(obj.id+" "+obj.name+" "+obj.pwd+" inserted...");
	}
	@Override
	public User select(String obj) {
		User u = null;
		System.out.println("Search: "+obj);
		u = new User("id01", "James", "pwd01");
		return u;
	}

	@Override
	public ArrayList<User> select() {
		ArrayList<User> list = new ArrayList<>();
		list.add(new User("id01","James","pwd01"));
		list.add(new User("id02","Tom  ","pwd02"));
		list.add(new User("id03","Lion ","pwd03"));
		list.add(new User("id04","Cat  ","pwd04"));
		list.add(new User("id05","Neo  ","pwd05"));
		return list;
	}

	@Override
	public void update(User obj) {
		System.out.println(obj+" updated...");		
		
	}

	@Override
	public void delete(String obj) {
		System.out.println(obj+" deleted...");
		
	}

}