package lk.ac.vau.controller;

import java.util.List;
import lk.ac.vau.model.Student;
import lk.ac.vau.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping 

public class studentController {

	@Autowired
	private StudentService ser = new StudentService();
	
	@GetMapping("/all")
	public String getStudents(){
		return "Hello IT Students!";
	}
	@GetMapping("/getAllStudents")
	public List<Student> getSAllstudents(){
		return ser.getAll();
	}
	@PostMapping("/insert")
	public void RegesterNewStudent(@RequestBody Student student){
		ser.addnewStu(student);
	} 
	@GetMapping("/{id}")
	public Student getByStuId(@PathVariable("id") Long id){
		return ser.getByStuId(id);
	}
	@PutMapping("/putv")
	public String updateStu(@RequestBody Student student){
		ser.updateStu(student);
		return "the department updated";
	}
	@DeleteMapping(path="{studentId}")
	public void deleteStudent(@PathVariable("studentId") Long studentId){
		ser.deleteStuById(studentId);
	}
	
}
