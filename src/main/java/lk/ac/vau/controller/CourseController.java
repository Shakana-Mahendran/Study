package lk.ac.vau.controller;

import java.util.List;
import lk.ac.vau.model.Course;
import lk.ac.vau.service.CourseService;
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
@RequestMapping("/Course")

public class CourseController {

    @Autowired
    private CourseService serv;

	@GetMapping("/all")
    public List<Course> showAl(){
        return serv.getAlls();
    }
    @PostMapping("/insert")
	public void RegesterNewCourse(@RequestBody Course course){
		serv.addnewCou(course);
	} 
    @GetMapping("/{id}")
	public Course getByCouId(@PathVariable("id") Long id){
		return serv.getByCouId(id);
	}
    @PutMapping("/putv")
	public String updateCou(@RequestBody Course course,Long id){
		serv.updateCou(course,id);
		return "the Course updated";
	}
	@DeleteMapping(path="{courseId}")
	public void deleteCou(@PathVariable("courseId") Long courseId){
		serv.deleteCouById(courseId);
	}

}
