package com.example.demo.CustomerService;

import java.util.List;
@Service
public class StudentSer {
	@Autowired
	StudentREpo repobj;

	public String addStudent(StudentSer pojobj)
	{
		repobj.save(pojobj);
	return"Added";
	}
	public List<Studentmodel>getStudent()
	{
		return repobj.findAll();
	}
	
	public Optional<Studentmodel>getStudentById(int id)
	{
		return repobj.findById(id);
	}

}