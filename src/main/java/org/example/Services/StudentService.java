package org.example.Services;

import org.example.Model.StudentDTO;

import java.util.List;

public interface StudentService {
    public void addStudent(StudentDTO student);
    public StudentDTO getStudentById(Integer id);
    public List<StudentDTO> getAllStudent();
    public void updateStudent(StudentDTO studentDTO);
    public void deleteStudentById(Integer id);

}
