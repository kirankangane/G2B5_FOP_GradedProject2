package com.greatlearnings.main;

import com.greatlearnings.departments.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment adminDept = new AdminDepartment();
		HrDepartment hrDept = new HrDepartment();
		TechDepartment techDept = new TechDepartment();

		// Displaying functionalities of each department
		System.out.println(adminDept.departmentName());
		System.out.println(adminDept.getTodaysWork());
		System.out.println(adminDept.getWorkDeadline());
		System.out.println(adminDept.isTodayAHoliday());
		System.out.println();

		System.out.println(hrDept.departmentName());
		System.out.println(hrDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadline());
		System.out.println(hrDept.doActivity("team Lunch"));
		System.out.println(hrDept.isTodayAHoliday());
		System.out.println();

		System.out.println(techDept.departmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(techDept.getTechStackInformation());
		System.out.println(techDept.isTodayAHoliday());

	}

}
