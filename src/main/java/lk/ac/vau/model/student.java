package lk.ac.vau.model;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class student {
	@Id
	private String RegNo;
	private String Course;
	private double GPA;
	private int Age;
	private String Name;
	
	public student() {
		super();
		
	}
	public student(String regNo, String course, double gPA, int age, String name) {
		super();
		RegNo = regNo;
		Course = course;
		GPA = gPA;
		Age = age;
		Name = name;
	}
	public String getRegNo() {
		return RegNo;
	}
	public void setRegNo(String regNo) {
		RegNo = regNo;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

}
