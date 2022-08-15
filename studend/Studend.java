package org.studend;

import org.department.Department;

public class Studend extends Department {
	public void studendName(String names) {
		System.out.println("stundend name" + names);
	}

	public void studendId(int id) {
		System.out.println("id" + id);
	}

	public void studendDept(String dept) {
		System.out.println("dept" + dept);
	}

	public static void main(String[] args) {
		Studend obj = new Studend();
		obj.collegeCode(001);
		obj.collegeName("ceg");
		obj.collegeRank(002);
		obj.deptName("industrial engg");
		obj.studendDept("Automobile");
		obj.studendId(17);
		obj.studendName("shikamaru");
	}

}
