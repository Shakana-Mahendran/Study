package lk.ac.vau.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class studentController {
	@GetMapping("/all")
	public String getStudents(){
		return "Hello IT Students!";
	}
	//http://localhost:8080/student/all
		//output:-Hello IT Students!
}
