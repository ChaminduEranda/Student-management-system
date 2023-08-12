package com.chamindu.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chamindu.demo.entity.Student;

// '@Repository' is not added because it is already implemented in JpaReposity
public interface StudentRepository extends JpaRepository<Student, Long>{
	

}
