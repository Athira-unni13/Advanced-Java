package iopack;

import java.io.Serializable;

public class Employee implements Serializable{
	int empid;
	String name;
	
	public Employee(int empid, String name) {
		this.empid = empid;
		this.name = name;
	}
	
}
