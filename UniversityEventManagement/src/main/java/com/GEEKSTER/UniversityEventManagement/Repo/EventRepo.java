package com.GEEKSTER.UniversityEventManagement.Repo;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GEEKSTER.UniversityEventManagement.Model.Event;

@Repository
public interface EventRepo extends JpaRepository<Event, Integer>{

	Iterable<Event> findByDate(LocalDate date);

}
