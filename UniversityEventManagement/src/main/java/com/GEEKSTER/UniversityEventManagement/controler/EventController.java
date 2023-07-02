package com.GEEKSTER.UniversityEventManagement.controler;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GEEKSTER.UniversityEventManagement.Model.Event;
import com.GEEKSTER.UniversityEventManagement.Model.Student;
import com.GEEKSTER.UniversityEventManagement.Service.EventService;

@RestController
public class EventController {

	@Autowired
	EventService eventservice;
	
	@PostMapping("/addEvent")
 	public String  insertEvent(@RequestBody List<Event> event) {
		eventservice.addEvent(event) ;
		return " Event Data Stored";
	}
	
	@PutMapping("/updateEvent")
 	public String  updateEvent(Event event) {
		eventservice.updateEvent(event) ;
		return " Event Data updated";
	}
	
	@DeleteMapping("/deleteEventbyId/{id}")
 	public String  deleteEvent(@PathVariable String id) {
		eventservice.deleteEvent(id) ;
		return " Event Deleted";
	}
	
	@GetMapping("/getEventsbydate/{date}")
 	public Iterable<Event>  getEvent(@PathVariable LocalDate date) {
		
		return eventservice.getEvent(date);
	
	}
}
