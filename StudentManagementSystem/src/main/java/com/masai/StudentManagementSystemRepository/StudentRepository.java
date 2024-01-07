package com.masai.StudentManagementSystemRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.StudentManagementSystem.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	List<Student> findByName(String name);
}
