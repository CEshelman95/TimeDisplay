package com.revature.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.Services.TimeService;

@RestController
@RequestMapping("/time")
@CrossOrigin
public class TimeController {
	
	@Autowired
	private TimeService ts;
	
	@GetMapping
	public String getTimeInWords(@RequestParam(name = "hours", required = true) int h, @RequestParam(name = "minutes", required = true) int m) {
		return ts.getTimeInWords(h, m);
	}
	
}
