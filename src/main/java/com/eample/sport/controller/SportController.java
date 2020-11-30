package com.eample.sport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.sport.Service.SportService;
import com.example.sport.model.Sport;

@RestController
public class SportController {

	@Autowired
	private SportService sportService;
	
	@GetMapping("/api/sport")
	public List<Sport> getSport(@RequestParam(value="country", required=false)String country, @RequestParam(value="color", required=false)String color)
	{
		return sportService.getSport(country,color);
		 
		
	}
	
	@PostMapping("/api/sport")
	public Sport createSportType(@RequestBody Sport sport)
	{
		
		return sportService.createSportType(sport);
		
	}
	
	@GetMapping("/api/sport/{sportRank}")
	public List<String> getSportByRank(@PathVariable ("sportRank") Integer sportRank)
	{
		return sportService.getSportByRank(sportRank);
		
	}
	
}
