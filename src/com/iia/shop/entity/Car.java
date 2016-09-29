package com.iia.shop.entity;

public class Car {
	
	private int Year;
	private String model;
	private String color;
	private Double price;
	private int speed;
	
	

	
	private String marque;
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public Car(int year, String model, String color, Double price, String marque, int speed) {
		super();
		Year = year;
		this.model = model;
		this.color = color;
		this.price = price;
		this.marque = marque;
		this.speed = speed;
	
	}
	
	public static void Start (){
		
	}
	public static void Stop (){
		
	}
	
	public static void SpeedUp (){
		
	}
	public static void SpeedDown (){
	
}
	
	
}
