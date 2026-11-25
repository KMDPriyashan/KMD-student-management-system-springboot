package org.example.Services.impl;

import lombok.RequiredArgsConstructor;
import org.example.Entity.InstructorEntity;
import org.example.Model.InstructoreDTO;
import org.example.Repository.InstructoreRepository;
import org.example.Services.InstructoreService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class InstructoreServiceimpl implements InstructoreService {

    final InstructoreRepository repository;

    @Override
    public void addInstructor(InstructoreDTO instructoreDTO) {
        ModelMapper mapper = new ModelMapper();
        InstructorEntity instructorEntity = mapper.map(instructoreDTO,InstructorEntity.class);
        repository.save(instructorEntity);
        System.out.println(instructorEntity);
    }

    @Override
    public InstructoreDTO getInstructorById(Integer id) {
        return new ModelMapper().map(repository.findById(id), InstructoreDTO.class);
    }

    @Override
    public List<InstructoreDTO> getAllInstructor() {
        Iterable<InstructorEntity> all = repository.findAll();
        List<InstructoreDTO> instructoreDTOList = new ArrayList<>();
        all.forEach(instructorEntity ->
                instructoreDTOList.add(new ModelMapper().map(instructorEntity,InstructoreDTO.class)));
        return instructoreDTOList;
    }

    @Override
    public boolean updateInstructor(InstructoreDTO instructoreDTO) {
        ModelMapper mapper = new ModelMapper();
        InstructorEntity instructorEntity = mapper.map(instructoreDTO,InstructorEntity.class);
        repository.save(instructorEntity);
        return true;
    }

    @Override
    public boolean deleteInstructorById(Integer id) {
        repository.deleteById(id);
        return true;
    }
}
