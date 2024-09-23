package com.evergent.corejava.student1a;

import java.io.Serializable;

public class StudentBean implements Serializable {
	private String name;
	private int marks;
	private String grade;
	private int studentId;
	public int getstudentId() {
		return studentId;
	}
	public void setstudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public int getmarks() {
		return marks;
	}
	public void setmarks(int marks) {
		this.marks = marks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
	
	
}
