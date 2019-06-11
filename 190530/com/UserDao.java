package com;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import frame.Dao;
import frame.Sql;
import vo.User;

public class UserDao extends Dao<String, User> {

	@Override
	public void insert(User v) throws Exception {
		
		PreparedStatement pstmt = null;
		Connection con = null;
		con = getCon();
		try {
		pstmt = getCon().prepareStatement(Sql.insertUser);
		pstmt.setString(1, v.getId());
		pstmt.setString(2, v.getPwd());
		pstmt.setString(3, v.getName());
		pstmt.executeUpdate();//테이블에서 데이터 갱신
		}catch(Exception e) {
			throw e;
		}finally {
		close(pstmt);
		close(con); //close를 꼭 해줘야한다..
		}
	}

	@Override
	public void delete(String k) throws Exception {
		PreparedStatement pstmt = null;
		Connection con = null;
		con = getCon();
		try {
			pstmt = getCon().prepareStatement(Sql.insertDelete);
			pstmt.setString(1, k);
			int result = pstmt.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			throw e;
		}finally {
			close(pstmt);
			close(con);
			}
		
	}

	@Override
	public void update(User v) throws Exception {
		PreparedStatement pstmt = null;
		Connection con = null;
		con = getCon();
		try {
			pstmt = con.prepareStatement(Sql.insertUpdate);
			pstmt.setString(1, v.getPwd());
			pstmt.setString(2, v.getName());
			pstmt.setString(3, v.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw e;
		} finally {
			close(pstmt);
			close(con);
			}
		
	}

	@Override
	public void select(String k) throws Exception {
		
		PreparedStatement pstmt = null;
		Connection con = null;
		con = getCon();
		ResultSet rset = null;
		try {
			pstmt = con.prepareStatement(Sql.insertSelect);
			pstmt.setString(1, k);
			rset = pstmt.executeQuery();
			rset.next();
			String uid = rset.getString("ID");
			String upwd = rset.getString("PWD");
			String uname = rset.getString("NAME");
			System.out.println(uid+" "+upwd+" "+uname);
		} catch (SQLException e) {
			throw e;
		} finally {
			close(pstmt);
			close(con);
			}
	}

	@Override
	public ArrayList<User> select() throws Exception {
		ArrayList<User> a = new ArrayList<>();
		PreparedStatement pstmt = null;
		Connection con = null;
		con = getCon();
		ResultSet rset = null;
		try {
			pstmt = con.prepareStatement(Sql.insertSelectall);
			rset = pstmt.executeQuery();
			while(rset.next()) {
				String uid = rset.getString("ID");
				String upwd = rset.getString("PWD");
				String uname = rset.getString("NAME");
				a.add(new User(uid, upwd, uname));
			} 
		}catch (SQLException e) {
			throw e;
		}finally {
			close(pstmt);
			close(con);
			}
		return a;
	
		}
	}