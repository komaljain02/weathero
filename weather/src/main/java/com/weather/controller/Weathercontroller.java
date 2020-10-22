package com.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.weather.model.DateIcon;
import com.weather.model.WeatherdataVO;
import com.weather.service.WeatherService;

@Controller
public class Weathercontroller {
	
	@Autowired
	private WeatherService weatherservice;
	
	@RequestMapping("/")
	public ModelAndView homepage(Model model)
	{
		WeatherdataVO wdo = weatherservice.getWeatherInfo("London,UK");
		DateIcon di = weatherservice.convertData(wdo);
		model.addAttribute("key",di);
		return new ModelAndView("page","data",wdo);
	}
	
	@RequestMapping(value="getweather",method=RequestMethod.GET)
	public ModelAndView getWeather(@RequestParam String city,Model model)
	{
		WeatherdataVO wdo = weatherservice.getWeatherInfo(city);
		DateIcon di = weatherservice.convertData(wdo);
		model.addAttribute("key",di);
		return new ModelAndView("page","data",wdo);
	}
	
}