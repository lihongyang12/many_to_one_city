package com.lhy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.lhy.entity.City;
import com.lhy.entity.Sheng;
import com.lhy.mapper.CityMapper;
import com.lhy.service.CityService;

@Service
@Transactional
public class CityServiceImpl implements CityService {
	
	@Autowired
	private CityMapper cityMapper;

	@Override
	public List<City> findAll() {
		List<City> clist = cityMapper.findAll();
		return clist;
	}
	
	@Override
	public List<Sheng> shengFind() {
		List<Sheng> slist = cityMapper.shengFind();
		return slist;
	}
	@Override
	public int add(Model model, City city) {
		
		return cityMapper.add(city);
	}

	@Override
	public int del(String sid) {
		int i = cityMapper.del(sid);
		return i;
	}

	@Override
	public City toupdate(String sid) {
		City city = cityMapper.toupdate(sid);
		return city;
	}

	@Override
	public void update(City city) {
		cityMapper.update(city);
		
	}

	
	
}
