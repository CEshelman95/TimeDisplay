package com.revature.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.Beans.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer>{

}
