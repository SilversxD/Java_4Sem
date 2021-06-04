package Task16.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;
import Task16.dto.StudentToGroupRequest;
import Task16.services.GroupService;
import Task16.services.StudentService;

import javax.validation.Valid;

@Slf4j
@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private GroupService groupService;
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public RedirectView add(
            @Valid @ModelAttribute("addStudent") StudentToGroupRequest studentToGroupRequest,
            BindingResult result
    ) {
        if (!result.hasErrors()) {
            groupService.publish(studentToGroupRequest);
            studentService.publish(studentToGroupRequest);
        }
        return new RedirectView("/groups");
    }

    @PostMapping("/{studentId}/delete")
    public RedirectView delete(@PathVariable long studentId) {
        studentService.delete(studentId);
        return new RedirectView("/groups");
    }
}
