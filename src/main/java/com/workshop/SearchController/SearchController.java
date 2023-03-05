package com.workshop.SearchController;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.workshop.entity.Buses;
import com.workshop.service.BusService;
@Controller
public class SearchController {
	
	@Autowired
	private BusService service;
	
	
	@GetMapping("/")
	public String showHome(Model model) {
		model.addAttribute("buses", new Buses());

		return "home";
	}
	
	 
	@GetMapping("/add-bus")
	public String showAddBusesForYearForm(Model model) {
	    Buses buses = new Buses();
	    model.addAttribute("buses", buses);
	    return "addbus";
	}
 
	 
	 
	 
	
	 
	 
	 
	 
	 
	 
	 
	 
	
	@RequestMapping("/search")
	public String searchBuses(@RequestParam(value = "from") String from,
            @RequestParam(value = "to") String to, Model model){
		
		
		List<Buses> buses = service.findByToAndFrom(to, from);
		 if(buses.isEmpty()) {
		        return "no-results";
		    }
		 model.addAttribute("buses", buses);
		    return "search-results";
		
	}
	
	
	

}
