package org.example.Controller;

import lombok.RequiredArgsConstructor;
import org.example.Model.CourseDTO;
import org.example.Services.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("course")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class CourseController {

    final CourseService service;

    @PostMapping("/add")
    public void addCourse(@RequestBody CourseDTO courseDTO){
        service.addCourse(courseDTO);
    }

    @GetMapping("/get/{id}")
    public CourseDTO getCourseById(@PathVariable Integer id){
        return service.getCourseById(id);
    }

    @GetMapping("/get-all")
    public List<CourseDTO> getAllCourse(){
        return service.getAllCourse();
    }

    @PostMapping("/update")
    public boolean updateCourse(CourseDTO courseDTO){
        return service.updateCourse(courseDTO);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteCourseById(@PathVariable Integer id){
        return service.deleteCourseById(id);
    }
}
