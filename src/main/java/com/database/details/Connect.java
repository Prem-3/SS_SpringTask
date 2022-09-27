package com.database.details;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connect {
	public  ResultSet getConnect(String empName) throws SQLException {
		Employee e=new Employee();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/soprasteria", "root",
					"SopraSteria@2025");
			String sql = "select * from emp1 where empName=?";
			PreparedStatement ps = connect.prepareStatement(sql);
			ResultSet rs=ps.executeQuery(sql);
			while(rs.next()) {
                e.setEmpId(Integer.parseInt(rs.getInt("empId")));
                e.setEmpName(rs.getString("empName"));
                e.setEmpEmail(rs.getString("empEmail"));
			}
		}
			//return rs;
		 catch (ClassNotFoundException k) {
			k.printStackTrace();
		}
		return (ResultSet) e;
	
}
}
