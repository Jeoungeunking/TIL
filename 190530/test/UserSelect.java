package test;

import com.UserDao;

import frame.Dao;
import vo.User;

public class UserSelect {
		public static void main(String[] args) {
			Dao<String, User> dao = new UserDao();
			String id = "id20";
			try {
				dao.select(id);
			}catch(Exception e){
				e.printStackTrace();
				
			}
		}

}
