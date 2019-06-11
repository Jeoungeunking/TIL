package test;

import java.util.ArrayList;

import com.UserDao;

import frame.Dao;
import vo.User;

public class UserSelectall {
	public static void main(String[] args) {
			Dao<String, User> dao = new UserDao();
			ArrayList<User> a;
			try {
				a = dao.select();
				for(User u: a) {
					System.out.println(u);
				}
			}catch(Exception e){
				e.printStackTrace();
				
			}
	}

}
