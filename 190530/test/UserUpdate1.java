package test;

import com.UserDao;

import frame.Dao;
import vo.User;

public class UserUpdate {
		public static void main(String[] args) {
			Dao<String, User> dao = new UserDao();
			User user = new User("id20","james","pwd20");
			try {
				dao.update(user);
				System.out.println("User Updated");
			}catch(Exception e){
				e.printStackTrace();
				
			}
	}

}
