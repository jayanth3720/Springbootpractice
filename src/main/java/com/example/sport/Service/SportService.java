package com.example.sport.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.sport.model.Sport;
@Service
public interface SportService {

public Sport createSportType(Sport sport);

public List<String> getSportByRank(Integer sportRank);

public List<Sport> getSport(String country, String color);

}
