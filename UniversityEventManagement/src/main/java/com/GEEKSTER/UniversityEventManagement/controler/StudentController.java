package com.GEEKSTER.UniversityEventManagement.controler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.GEEKSTER.UniversityEventManagement.Model.Student;
import com.GEEKSTER.UniversityEventManagement.Repo.StudentRepo;
import com.GEEKSTER.UniversityEventManagement.Service.StudentService;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

	@Autowired
	StudentService studentservice;

	@PostMapping("/addStudent")
 	public String  insertStudent(@RequestBody List<Student> student) {

		studentservice.addStudent(student) ;
		return "Data Stored";
	}
	
	@DeleteMapping("/deleteStudentbyId/{Id}")
	public String deletingStudent(@PathVariable String Id) {
		studentservice.deletingStudent(Id);
		return "Student Deleted Succesfully";
	}
	@PutMapping("/updateStudent/{Department}/{Id}")
	public String updateStudent(@PathVariable String Department, @PathVariable String Id) {
		studentservice.updateStudent(Department, Id);
		return "Student Succesfully updataed";
	}
	
	@GetMapping("/getAllStudents")
	public Iterable<Student> getallStudents(){
		return studentservice.getallStudents();
	}

	@GetMapping("/getStudentById/{id}")
	public Optional<Student> getallStudents(@PathVariable String id){
		return studentservice.getStudentbyId(id);
	}
}
