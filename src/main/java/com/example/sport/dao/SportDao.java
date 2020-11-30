package com.example.sport.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.example.sport.model.Sport;

@Repository
public class SportDao {

	private List<Sport> sportList;
	
	@PostConstruct
	public void initialize() {
		sportList= new ArrayList<>();
	}
	
	public List<Sport> getSport() {
		
		return sportList;
	}

	public void createSportType(Sport sport)
	{
		sportList.add(sport);
	}
	
	public Sport getSportByRank(int SportRank)
	{
		Sport spt=null;
		for(Sport sport: sportList)
		{
			if(sport.getSportRank()==SportRank)
			{
				spt=sport;
			}
		}
		return spt;
	}
	

	
}
