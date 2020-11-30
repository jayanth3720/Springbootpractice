package com.example.car.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.example.car.model.Cars;

@Repository
public class CarDao {

	private List<Cars> carList;
	
	
	
	
	@PostConstruct
	public void initialize() {
		carList= new ArrayList<>();
	}




	public void createCar(Cars cars) {
		// TODO Auto-generated method stub
		System.out.println("CarDao.createCar() with cars "+cars);
		carList.add(cars);
	}




	public Cars getCarByModel(int model) {
		// TODO Auto-generated method stub
		System.out.println("CarDao.getCarByModel() with model"+model);
		Cars retCar=null;
		for(Cars car: carList) {
			if(car.getModel()==model) {
				retCar=car;
			}
		}
		return retCar;
	}




	public List<Cars> getCars() {
		// TODO Auto-generated method stub
		System.out.println("CarDao.getCars()");
		return carList;
	}
}
