package org.example.Controller;

import lombok.RequiredArgsConstructor;
import org.example.Model.StudentDTO;
import org.example.Services.impl.StudentServiceimpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("student")
@CrossOrigin(origins = "*")
public class StudentController {
    final StudentServiceimpl service;

    @PostMapping("/add")
    public Boolean addStudent(@RequestBody StudentDTO studentDTO){
        service.addStudent(studentDTO);
        return true;
    }

    @GetMapping("/get/{id}")
    public StudentDTO getStudentById(@PathVariable Integer id){
        return service.getStudentById(id);
    }

    @GetMapping("/get-all")
    public List<StudentDTO> getAllStudent(){
        return service.getAllStudent();
    }

    @PostMapping("/update")
    public void updateStudent(StudentDTO studentDTO){
        service.updateStudent(studentDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudentById(@PathVariable Integer id){
        service.deleteStudentById(id);
    }

}
