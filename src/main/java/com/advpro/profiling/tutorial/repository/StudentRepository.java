package com.advpro.profiling.tutorial.repository;

import com.advpro.profiling.tutorial.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;

/**
 * @author muhammad.khadafi
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("SELECT STRING_AGG(s.name, ', ') FROM Student s")
    String joinStudentNames();

    @Query("SELECT s FROM Student s ORDER BY s.gpa DESC LIMIT 1")
    Optional<Student> findStudentWithHighestGpa();
}