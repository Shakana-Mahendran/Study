package lk.ac.vau.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {	
	
	private @Id @GeneratedValue Long id;
	private double GPA;
	private int Age;
	private String Name;
	@OneToMany(mappedBy = "student")
	private List<Course> course;

	public Student() {
		
	}
	public Student(Long id, double gPA, int age, String name,List<Course> course) {
		super();
		this.id = id;
		GPA = gPA;
		Age = age;
		Name = name;
		this.course=course;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public List<Course>getCourse(){
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	
}
