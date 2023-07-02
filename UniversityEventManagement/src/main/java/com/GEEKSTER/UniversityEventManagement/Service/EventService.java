package com.GEEKSTER.UniversityEventManagement.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GEEKSTER.UniversityEventManagement.Model.Event;
import com.GEEKSTER.UniversityEventManagement.Repo.EventRepo;

@Service
public class EventService {

	@Autowired
	EventRepo eventrepo;
	
	
	public void addEvent(List<Event> eventList) {
		eventrepo.saveAll(eventList);
		
	}


	public void updateEvent(Event event) {
		eventrepo.save(event);
		
	}


	public void deleteEvent(String id) {
		Integer Id = Integer.parseInt(id);
		eventrepo.deleteById(Id);
		
	}


	public Iterable<Event> getEvent(LocalDate date) {
		
		return eventrepo.findByDate(date);
	}

}
