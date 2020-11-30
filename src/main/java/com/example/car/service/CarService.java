package com.example.car.service;

import java.util.List;

import com.example.car.model.Cars;

public interface CarService {

	public List<Cars> getCars(String country, Integer cont);

	public Cars getCarsByModel(String model);

	public Cars createCar(Cars cars);

}
