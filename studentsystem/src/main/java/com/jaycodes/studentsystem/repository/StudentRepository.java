package com.jaycodes.studentsystem.repository;

import com.jaycodes.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository <Student, Integer> {
}
