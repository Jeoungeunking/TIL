package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) {
		// 1. JDBC Driver Loading..
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Loading Error");
		}
		// 2. Connection 1521 db db
		String id = "db";
		String password = "db";
		String url = 
		"jdbc:oracle:thin:@70.12.50.238:1521:xe";
		
		Connection con = null;
		try {
			con = 
			DriverManager.getConnection(url, id, password);
		} catch (SQLException e) {
			System.out.println("Connection Error");		
			e.printStackTrace();
		}
		
		// 3. SQL 전송
		String sql = 
		"UPDATE T_USER SET PWD=?,NAME=? WHERE ID=?";
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "2222");
			pstmt.setString(2, "오말년");
			pstmt.setString(3, "id01");
			int result = pstmt.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 4. close
		try {
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}







