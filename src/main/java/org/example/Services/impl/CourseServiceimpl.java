package org.example.Services.impl;

import lombok.RequiredArgsConstructor;
import org.example.Entity.CourseEntity;
import org.example.Model.CourseDTO;
import org.example.Repository.CourseRepository;
import org.example.Services.CourseService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceimpl implements CourseService {

    final CourseRepository repository;

    @Override
    public void addCourse(CourseDTO courseDTO) {
        ModelMapper mapper = new ModelMapper();
        CourseEntity courseEntity = mapper.map(courseDTO,CourseEntity.class);
        repository.save(courseEntity);
        System.out.println(courseDTO);
    }

    @Override
    public CourseDTO getCourseById(Integer id) {
        return new ModelMapper().map(repository.findById(id), CourseDTO.class);
    }

    @Override
    public List<CourseDTO> getAllCourse() {
        Iterable<CourseEntity> all = repository.findAll();
        List<CourseDTO> courseDTOList = new ArrayList<>();
        all.forEach(courseEntity ->
                courseDTOList.add(new ModelMapper().map(courseEntity,CourseDTO.class)));
        return courseDTOList;
    }

    @Override
    public boolean updateCourse(CourseDTO courseDTO) {
        ModelMapper mapper = new ModelMapper();
        CourseEntity courseEntity = mapper.map(courseDTO,CourseEntity.class);
        repository.save(courseEntity);
        return true;
    }

    @Override
    public boolean deleteCourseById(Integer id) {
        repository.deleteById(id);
        return true;
    }
}
