package com.lhy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lhy.entity.City;
import com.lhy.entity.Sheng;
import com.lhy.service.CityService;

@Controller
public class CityController {
	
	@Autowired
	private CityService  cityService;
	
	@RequestMapping("findAll")
	public String findAll(Model model) {
		List<City> clist = cityService.findAll();
		model.addAttribute("clist", clist);
		return "list";
	}
	
	@RequestMapping("toadd")
	public String toadd(Model model) {
		List<Sheng> slist = cityService.shengFind();
		model.addAttribute("slist",slist);
		System.out.println(slist);
		return "add";
	}
	
	@RequestMapping("add")
	public String add(Model model,City city){
		 cityService.add(model,city);
		return "redirect:findAll";
	}
	
	@RequestMapping("del")
	public String del(String sid) {
		int del = cityService.del(sid);
		return "redirect:findAll";
	}
	
	@RequestMapping("toupdate")
	public String toupdate(String sid,Model model){
		City city = cityService.toupdate(sid);
		model.addAttribute("city",city);
		List<Sheng> slist = cityService.shengFind();
		model.addAttribute("slist",slist);
		System.out.println(city);
		System.out.println(slist);
		return "update";
	}
	
	@RequestMapping("update")
	public String update(City city){
		cityService.update(city);
		return "redirect:findAll";
	}
}
