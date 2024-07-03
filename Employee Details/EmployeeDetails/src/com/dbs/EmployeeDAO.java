package com.dbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {
Connection con;
PreparedStatement pst;
ResultSet rs;
public EmployeeDAO() {
	// TODO Auto-generated constructor stub
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/svdata1", "root", "root");
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}

public void storeData(Employee e) {
	String sql="insert into employee(id, name, city, salary, dept) values(?, ?, ?, ?, ?)";
	try {
		pst=con.prepareStatement(sql);
		pst.setInt(1, e.getId());
		pst.setString(2, e.getName());
		pst.setString(3, e.getCity());
		pst.setFloat(4, e.getSalary());
		pst.setString(5, e.getDept());
		pst.executeUpdate();
		System.out.println("data inserted");
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
}
public void retrieveData() {
	String str="select * from employee";
	try {
		pst=con.prepareStatement(str);
		rs=pst.executeQuery();
		System.out.println("ID \t NAME \t CITY \t SALARY \t DEPT");
		while(rs.next()) {
			System.out.println(rs.getInt("id")+"\t"+rs.getString("name")+"\t"+rs.getString("city")+"\t"+rs.getFloat("salary")+"\t"+rs.getString("dept"));
		}
		con.close();		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
public void retrieveData(int id) {}
public void deleteData() {}
public void updateData() {}
}

