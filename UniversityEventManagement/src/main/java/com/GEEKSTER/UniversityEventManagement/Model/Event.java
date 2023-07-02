package com.GEEKSTER.UniversityEventManagement.Model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
//import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Event {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eventId;
	
    @Column(name = "eventName")
	private String eventName;
    
    @Column(name = "locationOfEvent")
	private String locationOfEvent;
    
    @Column(name = "date")
	private LocalDate date;
    
    @Column(name = "startTime")
	private LocalTime startTime;
    
    @Column(name = "endTime")
	private LocalTime endTime;
}
