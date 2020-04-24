package com.revature.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.Beans.Event;
import com.revature.Services.EventService;

@RestController
@RequestMapping("/events")
@CrossOrigin
public class EventController {
	
	@Autowired
	private EventService es;
	
	@GetMapping
	public List<Event> getAllEvents() {
		return es.getEvents();
	}
	
	@GetMapping("/{id}")
	public Event getEventById(@PathVariable("id")int id) {
		return es.getEventById(id);
	}
	
	@PostMapping
	public ResponseEntity<HttpStatus> createEvent(@RequestBody Event event) {
		try {
			es.addEvent(event);
			return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping
	public ResponseEntity<HttpStatus> updateEvent(@RequestBody Event event) {
		try {
			es.updateEvent(event);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping
	public ResponseEntity<HttpStatus> deleteEvent(@RequestBody Event event) {
		try {
			es.deleteEvent(event);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
	
}
