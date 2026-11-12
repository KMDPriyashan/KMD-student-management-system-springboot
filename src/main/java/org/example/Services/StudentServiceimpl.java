package org.example.Services;

import org.example.Model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceimpl {

    public void createStudent(Student student){
        System.out.println(student);
    }
}
