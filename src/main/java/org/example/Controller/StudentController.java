package org.example.Controller;

import org.example.Model.Student;
import org.example.Services.StudentServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentServiceimpl service;

    @GetMapping("/create/student")
    public void createStudent(@RequestBody Student student){
        service.createStudent(student);

    }

}
