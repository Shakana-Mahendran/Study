package lk.ac.vau.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.ac.vau.model.Student;


@Repository
public interface studentRepo extends JpaRepository<Student, Long>{
    
}
