package lk.ac.vau.Repo;

import lk.ac.vau.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRepo extends JpaRepository<Course,Long>{
    
}
