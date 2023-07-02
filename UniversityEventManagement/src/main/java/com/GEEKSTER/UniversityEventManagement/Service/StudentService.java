package com.GEEKSTER.UniversityEventManagement.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GEEKSTER.UniversityEventManagement.Model.Student;
import com.GEEKSTER.UniversityEventManagement.Repo.StudentRepo;

import jakarta.transaction.Transactional;
//import com.GEEKSTER.UniversityEventManagement.controler.iterable;

@Service
public class StudentService {

	@Autowired
	StudentRepo studentrepo;

	public void addStudent(List<Student> student) {
		
		studentrepo.saveAll(student);
	}
	
    @Transactional
	public void deletingStudent(String id) {
		Integer Id = Integer.parseInt(id);
		studentrepo.deleteStudentBasedOnStudentId(Id);
	}
    
    @Transactional
	public void updateStudent(String newDepart, String id) {
		Integer Id = Integer.parseInt(id);
		studentrepo.updateDepartmentByStudentId(newDepart, Id);
		
	}

	public Iterable<Student> getallStudents() {
		
		return studentrepo.findAll() ;
	}

	@SuppressWarnings("deprecation")
	public Optional<Student> getStudentbyId(String id) {
		Integer Id = Integer.parseInt(id);
		return studentrepo.findById(Id) ;
	}
}
