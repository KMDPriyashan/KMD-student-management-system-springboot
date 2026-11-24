package org.example.Controller;

import lombok.RequiredArgsConstructor;
import org.example.Model.InstructoreDTO;
import org.example.Services.InstructoreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("instructor")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class InstructoreController {

    final InstructoreService service;

    @PostMapping("/add")
    public void addInsructor(@RequestBody InstructoreDTO instructoreDTO){
        service.addInstructor(instructoreDTO);
    }

    @GetMapping("/get/{id}")
    public InstructoreDTO getInstructorById(@PathVariable Integer id){
        return service.getInstructorById(id);
    }

    @GetMapping("/get-all")
    public List<InstructoreDTO> getAllInstructor(){
        return service.getAllInstructor();
    }

    @PostMapping("/update")
    public boolean updateInstructor(InstructoreDTO instructoreDTO){
        return service.updateInstructor(instructoreDTO);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteInstructorById(@PathVariable Integer id){
        return service.deleteInstructorById(id);
    }
}
