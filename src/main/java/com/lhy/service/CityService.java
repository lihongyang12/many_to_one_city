package com.lhy.service;

import java.util.List;

import org.springframework.ui.Model;

import com.lhy.entity.City;
import com.lhy.entity.Sheng;

public interface CityService {

	List<City> findAll();

	int add(Model model, City city);

	List<Sheng> shengFind();

	int del(String sid);

	City toupdate(String sid);

	void update(City city);

}
