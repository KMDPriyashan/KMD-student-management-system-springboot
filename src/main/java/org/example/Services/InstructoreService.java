package org.example.Services;

import org.example.Model.InstructoreDTO;

import java.util.List;

public interface InstructoreService {
    public void addInstructor(InstructoreDTO instructoreDTO);
    public InstructoreDTO getInstructorById(Integer id);
    public List<InstructoreDTO> getAllInstructor();
    public boolean updateInstructor(InstructoreDTO instructoreDTO);
    public boolean deleteInstructorById(Integer id);
}
