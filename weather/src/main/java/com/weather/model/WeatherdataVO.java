package com.weather.model;

public class WeatherdataVO {
	private Coordinates coord;
	private Weather[] weather;
	private String base;
	private Maindata main;
	private int visibility;
	private Winds wind;
	private Cloud clouds;
	private String dt;
	private Data sys;
	private int timezone;
	private int id;
	private String name;
	private int cod;

	public Coordinates getCoord() {
		return coord;
	}

	public void setCoord(Coordinates coord) {
		this.coord = coord;
	}

	public Weather[] getWeather() {
		return weather;
	}

	public void setWeather(Weather[] weather) {
		this.weather = weather;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public Maindata getMain() {
		return main;
	}

	public void setMain(Maindata main) {
		this.main = main;
	}

	public int getVisibility() {
		return visibility;
	}

	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}

	public Winds getWind() {
		return wind;
	}

	public void setWind(Winds wind) {
		this.wind = wind;
	}

	public Cloud getClouds() {
		return clouds;
	}

	public void setClouds(Cloud clouds) {
		this.clouds = clouds;
	}

	
	public String getDt() {
		return dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}

	public Data getSys() {
		return sys;
	}

	public void setSys(Data sys) {
		this.sys = sys;
	}

	public int getTimezone() {
		return timezone;
	}

	public void setTimezone(int timezone) {
		this.timezone = timezone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

}
