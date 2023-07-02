package com.GEEKSTER.UniversityEventManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.GEEKSTER.UniversityEventManagement.Model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student ,Integer> {

	@Modifying
	 @Query(value = "Delete from Student where Student_Id = :Id" , nativeQuery = true)
	void deleteStudentBasedOnStudentId(Integer Id);
	 
	@Modifying
	 @Query(value = "update Student set Department = :newdepart where Student_Id = :id", nativeQuery = true)
	 void updateDepartmentByStudentId(String newdepart,  Integer id);
}
