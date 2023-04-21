package lk.ac.vau.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Course {

    private @Id @GeneratedValue Long id;
    private String name;
    private int credit;
    @ManyToOne
    @JsonBackReference
    private Student student;

    public Course() {
        
    }

    public Course(Long id, String name, int credit,Student student) {
        this.id = id;
        this.name = name;
        this.credit = credit;
        this.student = student;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getCredit() {
        return credit;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCredit(int credit) {
        this.credit = credit;
    }
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }

} 
