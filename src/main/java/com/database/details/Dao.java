package com.database.details;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Dao {
	public List<Employee> AllUser() {
		String sql = "select * from emp1 ";
		List<Employee> listuser = new ArrayList<Employee>();
		
		try {
//			PreparedStatement st = Dao.getConnect().prepareStatement(sql);
//			Employee reg = null;
//			st.setString(1, user);
			ResultSet res = st.executeQuery();
			while (res.next()) {
				int empId=res.getInt("empId");
				String empName=res.getString("empName");
				String empEmail=res.getString("empEmail");
//				String uniqueCode=res.getString("eId");
				Employee e=new Employee(empId,empName,empEmail);
				listuser.add(e);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listuser;
}
}
