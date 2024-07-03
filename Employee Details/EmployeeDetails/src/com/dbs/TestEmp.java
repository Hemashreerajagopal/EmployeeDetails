package com.dbs;

public class TestEmp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EmployeeDAO().retrieveData();
		Employee e=new Employee(200, "Sumit", "Delhi", "Sales", 67000f);
		new EmployeeDAO().storeData(e);
	}

}


