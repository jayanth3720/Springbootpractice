package com.example.car.controller;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.car.model.Cars;
import com.example.car.service.CarService;

@RestController
public class CarController {
	
@Autowired
private CarService carService;

@GetMapping("/api/cars")
public List<Cars> getCars(@RequestParam(value="country",required=false) String country, @RequestParam(value="cont",required=false) Integer cont ) {
	System.out.println("method calling"+" "+  country +" "+ cont);	
	return carService.getCars(country,cont);
	//return new ArrayList<Cars>();
	}
@GetMapping("/api/cars/{model}")
public Cars getCarsByModel(@PathVariable("model") String model) {
	System.out.println("calling with model type"+" " +model);	
	return carService.getCarsByModel(model);
	}


@PostMapping("/api/cars")	
public Cars createCar(@RequestBody Cars cars)
	{
		System.out.println("cars are created "+ cars);
		
		return carService.createCar(cars);
		
	}

}
