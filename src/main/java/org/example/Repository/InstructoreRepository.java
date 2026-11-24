package org.example.Repository;

import org.example.Entity.InstructorEntity;
import org.springframework.data.repository.CrudRepository;

public interface InstructoreRepository extends
        CrudRepository<InstructorEntity ,Integer> {
}
