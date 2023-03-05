package com.workshop.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.entity.Buses;
import com.workshop.repo.BusRepo;
@Service
public class BusService {
	@Autowired
	private BusRepo repo;
	
	
	
	public List<Buses> findByToAndFrom (String to, String from){
		return repo.findByToAndFrom(to, from);
		
	}
	
	
}
