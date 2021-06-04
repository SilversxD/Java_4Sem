package Task15.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Task15.dto.StudentToGroupRequest;
import Task15.models.Group;
import Task15.models.Student;
import Task15.repositories.GroupRepository;
import Task15.repositories.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private StudentRepository studentRepository;

    public void publish(StudentToGroupRequest request) {
        String groupName = request.getGroupName();
        Group group = groupRepository.findByGroupName(groupName);
        if (group == null) {
            return;
        }
        Student student = new Student();
        student.setFirstName(request.getStudentFirstName());
        student.setLastName(request.getStudentLastName());
        student.setMiddleName(request.getStudentMiddleName());
        student.setGroup(group);
        studentRepository.save(student);
    }

    public void delete(long id) {
        studentRepository.deleteById(id);
    }
}
