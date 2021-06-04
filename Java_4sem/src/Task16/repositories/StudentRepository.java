package Task16.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Task16.models.Group;
import Task16.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteAllByGroup(Group group);
}
