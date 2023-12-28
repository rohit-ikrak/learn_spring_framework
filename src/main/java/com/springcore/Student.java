package com.springcore;

public class Student {
	private int studentId;
	private String studentName;
	private String studentState;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("setting student ID.");
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("setting student Name.");
		this.studentName = studentName;
	}
	public String getStudentState() {
		return studentState;
	}
	public void setStudentState(String studentState) {
		System.out.println("setting student State.");
		this.studentState = studentState;
	}
	public Student(int studentId, String studentName, String studentState) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentState = studentState;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentState=" + studentState
				+ "]";
	}
	
	
}
