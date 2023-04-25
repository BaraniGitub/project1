package com.example.demo.StudentService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Student.studentDetails;
import com.example.demo.StudentRepository.studentRespo;

@Service
public  class Studentservice {
    @Autowired
	studentRespo respository;
	
	public String addStudent(studentDetails student)
	{
		respository.save(student);
		return "add";
	}
	public List<studentDetails> getStudent()
	{
		return respository.findAll();
	}
	public  Optional<studentDetails> getStudentById(int id)
	{
		return respository.findById(id);
	}

}