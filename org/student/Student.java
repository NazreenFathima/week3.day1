package org.student;

import org.department.Department;


public class Student extends Department
{
	public void studentName()
	{
		// TODO Auto-generated method stub
		System.out.println("Student name is Nafa");
	}
	public void studentDept() 
	{
		// TODO Auto-generated method stub
		System.out.println("Student department is ECE");
	}
	public void studentId() 
	{
		// TODO Auto-generated method stub
		System.out.println("Student ID is 123456");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student StudentObj = new Student();
		StudentObj.studentName();
		StudentObj.studentDept();
		StudentObj.studentId();
		StudentObj.deptName();
		StudentObj.collegeName();
		StudentObj.collegeCode();
		StudentObj.collegeRank();
		
		
		
	}

}
