package com.lhy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lhy.entity.City;
import com.lhy.entity.Sheng;

@Mapper
public interface CityMapper {

	List<City> findAll();

	int add(City city);

	List<Sheng> shengFind();

	int del(String sid);

	City toupdate(String sid);

	void update(City city);
	
	
}
