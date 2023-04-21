package lk.ac.vau.service;

import java.util.List;
import java.util.Optional;
import lk.ac.vau.Repo.studentRepo;
import lk.ac.vau.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentService {

    @Autowired
    private studentRepo repo;
    public List<Student> getAll(){
        List<Student> result =  repo.findAll();
        return result;
    }
    public void addnewStu(Student student){
        repo.save(student);
        System.out.println(student);
    }
    public void updateStu(Student student) {
		repo.save(student);
	}
    public Student getByStuId(Long id) {
     Optional<Student> stud= repo.findById(id);
		if(!stud.isPresent()) {
			throw new Error("There is no Department with the Id "+id+" to delete.");
		}
		return stud.get();
	}
    public void deleteStudentById(Long id) {
        Optional<Student> stud= repo.findById(id);
		if(stud.isEmpty()) {
			//throw new EntityNotFoundException("There is no Department with the Id "+id+" to delete.");
            System.out.print("There is no Department with the Id "+id+" to delete.");
		}
		repo.deleteById(id);
	}
    
}
