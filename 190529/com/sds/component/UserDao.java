package com.sds.component;

import java.util.ArrayList;

import com.sds.frame.Dao;
import com.sds.vo.User;

public class UserDao extends Dao<String,User>{

	@Override
	public void insert(User v) throws Exception {
		if(v.getId().equals("id02")) {
			throw new Exception("E0001");//return 없어도 밑의 문장 실행 X
		}
		System.out.println(v+" Inserted...");
	}

	@Override
	public void delete(String k) throws Exception {
	
		System.out.println(k+" Deleted...");
		
	}

	@Override
	public void update(User v) throws Exception {
		if(v.getId().equals("id02")) {
			throw new Exception("E0003");//return 없어도 밑의 문장 실행 X
		}
		System.out.println(v+" Updated...");
	}

	@Override
	public User select(String k) throws Exception {
		User user = new User(k,"james","pwd01");
		return user;
	}

	@Override
	public ArrayList<User> select() throws Exception {
		ArrayList<User> list = new ArrayList<>();
		list.add(new User("id01","james,","pwd01"));
		list.add(new User("id02","james,","pwd02"));
		list.add(new User("id03","james,","pwd03"));
		list.add(new User("id04","james,","pwd04"));
		list.add(new User("id05","james,","pwd05"));
		return list;
	}


}
