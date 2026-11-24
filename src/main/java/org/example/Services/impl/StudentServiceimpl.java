package org.example.Services.impl;

import lombok.RequiredArgsConstructor;
import org.example.Entity.StudentEntity;
import org.example.Model.StudentDTO;
import org.example.Repository.StudentRepository;
import org.example.Services.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceimpl implements StudentService {
    
    final StudentRepository repository;

    @Override
    public void addStudent(StudentDTO studentDTO) {
        ModelMapper mapper = new ModelMapper();
        StudentEntity studentEntity = mapper.map(studentDTO,StudentEntity.class);
        repository.save(studentEntity);
        System.out.println(studentDTO);
    }

    @Override
    public StudentDTO getStudentById(Integer id) {
        return new ModelMapper().map(repository.findById(id),StudentDTO.class);
    }

    @Override
    public List<StudentDTO> getAllStudent() {
        Iterable<StudentEntity> all = repository.findAll();
        List<StudentDTO> studentDTOList = new ArrayList<>();
        all.forEach(studentEntity ->
                studentDTOList.add(new ModelMapper().map(studentEntity,StudentDTO.class)));
        return studentDTOList;
    }

    @Override
    public void updateStudent(StudentDTO studentDTO) {
        ModelMapper mapper = new ModelMapper();
        StudentEntity studentEntity = mapper.map(studentDTO,StudentEntity.class);
        repository.save(studentEntity);

    }

    @Override
    public void deleteStudentById(Integer id) {
        repository.deleteById(id);

    }
}
