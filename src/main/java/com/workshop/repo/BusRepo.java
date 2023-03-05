package com.workshop.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.entity.Buses;

public interface BusRepo  extends JpaRepository<Buses, Long>{
	
	List<Buses> findByToAndFrom(String to, String from);



}
