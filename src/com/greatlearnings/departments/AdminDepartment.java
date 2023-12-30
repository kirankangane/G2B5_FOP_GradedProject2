package com.greatlearnings.departments;

public class AdminDepartment extends SuperDepartment {

	@Override
	public String departmentName() {
		return "Welcome to Admin Department";
	}

	@Override
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}
