package Task15.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Task15.models.Group;
import Task15.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteAllByGroup(Group group);
}