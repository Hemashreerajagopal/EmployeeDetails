package com.dbs;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/svdata", "root", "root");
			Statement st=con.createStatement();
			String sql="insert into employee values(100, 'Rohit', 'Mumbai', 56600, 'Admin')";
			int result=st.executeUpdate(sql);
			con.close();
			System.out.println(result + " no of rows inserted...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

