package org.example.Repository;

import org.example.Entity.CourseEntity;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends
        CrudRepository<CourseEntity, Integer> {
}
