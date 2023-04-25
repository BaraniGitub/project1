package com.example.demo.Controller;
import java.util.List;

















@RestController
@RequestMapping("/abc")
public class Student_Controller {




  @Autowired
      StudentSer serobj;
		
  @PostMapping("")
  public String create(@RequestBody Studentmodel pojobj )
  {
	  return serobj.addStudent(pojobj);
  }
		
  @GetMapping("")
  public List<Studentmodel>read()
  {
	  return serobj.getStudent();
  }
		
  @GetMapping("/{id}")
  public Optional<Studentmodel>readById(@PathVariable int id)
   {
	  return serobj.getStudentById(id);
   }
		
}
	
