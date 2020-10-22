package com.weather.service;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.weather.model.DateIcon;
import com.weather.model.Weather;
import com.weather.model.WeatherdataVO;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Service
public class WeatherServiceImpl implements WeatherService{
	
	public WeatherdataVO getWeatherInfo(String city)
	{
		String web = "https://api.openweathermap.org/data/2.5/weather?q="+city+"&units=metric&appid=48a03dfea85ea293c31dae9950537bd2";
		ObjectMapper obj = new ObjectMapper();
		WeatherdataVO wdv = new WeatherdataVO();
		try
		{
			OkHttpClient client = new OkHttpClient().newBuilder()
					  .build();
			Request request = new Request.Builder()
					  .url(web)
					  .method("GET", null)
					  .build();
			Response response = client.newCall(request).execute();
			String str = response.body().string();
			wdv = obj.readValue(str,WeatherdataVO.class);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return wdv;
	}
	
	public DateIcon convertData(WeatherdataVO wdo)
	{
		Weather[] weather = wdo.getWeather();
		String weekday[] = {"Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday","Sunday"};
		String curr[] = Instant.ofEpochSecond(Long.valueOf(wdo.getDt())).toString().split("[TZ]");
		String rise[] =Instant.ofEpochSecond(Long.valueOf(wdo.getSys().getSunrise())).toString().split("[TZ]");
		String set[] =Instant.ofEpochSecond(Long.valueOf(wdo.getSys().getSunset())).toString().split("[TZ]");
		LocalDateTime ldt = LocalDateTime.ofInstant(Instant.ofEpochSecond(Long.valueOf(wdo.getDt())),ZoneId.systemDefault());
		DayOfWeek week = ldt.getDayOfWeek();
		int w = week.getValue();
		DateIcon dicon = new DateIcon();
		dicon.setIcon("http://openweathermap.org/img/wn/"+weather[0].getIcon()+"@2x.png");
		dicon.setSunrise(rise[1]);
		dicon.setSunset(set[1]);
		dicon.setDate(curr[0]);
		System.out.println(w+" "+curr[0]+" "+wdo.getDt());
		dicon.setDay(weekday[w-1]);
		return dicon;
	}
}
