package com.example.car.service;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.car.dao.CarDao;
import com.example.car.model.Cars;

@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	private CarDao carDao;

	@Override
	public List<Cars> getCars(String country, Integer cont) {
		System.out.println("CarServiceImpl.getCars()");
		// TODO Auto-generated method stub
		return carDao.getCars();
		//return new ArrayList<>();
	}

	@Override
	public Cars getCarsByModel(String model) {
		// TODO Auto-generated method stub
		System.out.println("CarServiceImpl.getCarsByModel()");
		return carDao.getCarByModel((Integer.parseInt(model)));
		//return car;
	}

	@Override
	public Cars createCar(Cars cars) {
		// TODO Auto-generated method stub
		System.out.println("CarServiceImpl.createCar() with cars "+cars);
		carDao.createCar(cars);
		return cars;
	}

}
