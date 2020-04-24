package com.revature.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.Beans.Event;
import com.revature.Repositories.EventRepository;

@Service
public class EventServiceImpl implements EventService {
	
	@Autowired
	private EventRepository er;
	
	@Override
	public List<Event> getEvents() {
		return er.findAll();
	}

	@Override
	public Event getEventById(int id) {
		return er.getOne(id);
	}

	@Override
	public void addEvent(Event event) {
		if (!er.existsById(event.getEventId())) {
			er.save(event);
		}
	}

	@Override
	public void updateEvent(Event event) {
		if (er.existsById(event.getEventId())) {
			er.save(event);
		}
	}

	@Override
	public void deleteEvent(Event event) {
		if (er.existsById(event.getEventId())) {
			er.delete(event);
		}
	}

}
