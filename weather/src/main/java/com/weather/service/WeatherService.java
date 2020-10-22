package com.weather.service;

import com.weather.model.DateIcon;
import com.weather.model.WeatherdataVO;

public interface WeatherService 
{
	public WeatherdataVO getWeatherInfo(String city);
	public DateIcon convertData(WeatherdataVO wdo);
}
