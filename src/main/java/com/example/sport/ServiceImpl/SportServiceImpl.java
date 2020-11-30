package com.example.sport.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.sport.Service.SportService;
import com.example.sport.dao.SportDao;
import com.example.sport.model.Sport;

public class SportServiceImpl implements SportService {

	@Autowired
	private SportDao sportDao;

	@Override
	public Sport createSportType(Sport sport) {
		// TODO Auto-generated method stub
		return sportDao.createSportType(sport);
	}

	@Override
	public List<String> getSportByRank(Integer sportRank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sport> getSport(String country, String color) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	

}
