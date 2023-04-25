package com.example.demo.StudentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Student.studentDetails;

public interface studentRespo extends JpaRepository<studentDetails,Integer>{
	
}