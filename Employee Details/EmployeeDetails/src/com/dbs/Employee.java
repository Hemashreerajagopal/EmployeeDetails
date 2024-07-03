package com.dbs;

public class Employee {
int id;
String name, city, dept;
float salary;
public Employee(int id, String name, String city, String dept, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.dept = dept;
	this.salary = salary;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getCity() {
	return city;
}
public String getDept() {
	return dept;
}
public float getSalary() {
	return salary;
}


}

