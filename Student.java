package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("StudentName method from Student class");
	}
	
	public void studentDept() {
		System.out.println("StudentDept method from Student class");
	}
	
	public void studentId() {
		System.out.println("StudentId method from Student class");
	}
	
	public static void main(String[] args) {
		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		System.out.println("=======================================");
		stud.deptName();
		System.out.println("=======================================");
		stud.studentId();
		stud.studentName();
		stud.studentDept();
	}

}
