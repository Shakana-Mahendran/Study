package lk.ac.vau.service;

import java.util.List;
import java.util.Optional;
import lk.ac.vau.Repo.CourseRepo;
import lk.ac.vau.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepo repos;

    public List<Course> getAlls(){
        List<Course> result =  repos.findAll();
        return result;
    }
    public void addnewCou(Course course){
        repos.save(course);
        System.out.println(course);
    }
    public Course getByCourseId(Long id) {
        Optional<Course> cou= repos.findById(id);
           if(!cou.isPresent()) {
               throw new Error("There is no Department with the Id "+id+" to delete.");
           }
           return cou.get();
    }
    public void updateCou(Course course,Long id) {
		repos.save(course);
	}
    public void deleteCourseById(Long id) {
        Optional<Course> cou= repos.findById(id);
		if(cou.isEmpty()) {
			//throw new EntityNotFoundException("There is no Department with the Id "+id+" to delete.");
            System.out.print("There is no Department with the Id "+id+" to delete.");
		}
		repos.deleteById(id);
	}
      
}
