package com.revature.Services;

import java.util.List;

import com.revature.Beans.Event;

public interface EventService {
	
	public List<Event> getEvents();
	public Event getEventById(int id);
	public void addEvent(Event event);
	public void updateEvent(Event event);
	public void deleteEvent(Event event);
	
}
