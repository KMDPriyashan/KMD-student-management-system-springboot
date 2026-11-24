package org.example.Services;

import org.example.Model.CourseDTO;

import java.util.List;

public interface CourseService {
    public void addCourse(CourseDTO courseDTO);
    public CourseDTO getCourseById(Integer id);
    public List<CourseDTO> getAllCourse();
    public boolean updateCourse(CourseDTO courseDTO);
    public boolean deleteCourseById(Integer id);
}
